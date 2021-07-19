package algorithms._1651_maximum_number_of_coins_you_can_get;

import java.util.Arrays;

/**
 * ** Created by peter.guan on 2021/07/19.
 *
 * @author peter.guan
 */
public class MaximumNumberOfCoinsYouCanGet {

    public int maxCoins(int[] piles) {

        Arrays.sort(piles);
        int max = 0;
        for (int i = piles.length - 2; i >= piles.length / 3; i = i - 2) {
            max += piles[i];
        }
        return max;
    }

}
