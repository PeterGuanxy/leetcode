package algorithms._0888_fair_candy_swap;

import java.util.Arrays;

/**
 * ** Created by peter.guan on 2021/08/06.
 *
 * @author peter.guan
 */
public class FairCandySwap {

    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {

        int sumA = 0;
        int sumB = 0;
        for (int a : aliceSizes) {
            sumA += a;
        }
        for (int b : bobSizes) {
            sumB += b;
        }

        boolean aliceFirst;
        if (sumA > sumB) {
            aliceFirst = true;
        } else {
            aliceFirst = false;
        }

        int diff = Math.abs(sumA - sumB) / 2;

        Arrays.sort(aliceSizes);
        Arrays.sort(bobSizes);

        for (int a : aliceSizes) {
            for (int b : bobSizes) {

                if (aliceFirst) {
                    if (b - a == -diff) {
                        return new int[]{a, b};
                    }
                } else {
                    if (b - a == diff) {
                        return new int[]{a, b};
                    }
                    if (b - a > diff) {
                        break;
                    }
                }
            }
        }

        return null;
    }

    public static void main(String[] args) {
        FairCandySwap fairCandySwap = new FairCandySwap();
        fairCandySwap.fairCandySwap(new int[]{1, 2, 5}, new int[]{2, 4});
    }

}
