package algorithms._1051_height_checker;

import java.util.Arrays;

/**
 * ** Created by peter.guan on 2021/07/21.
 *
 * @author peter.guan
 */
public class HeightChecker {

    public int heightChecker(int[] heights) {

        int[] curr = Arrays.copyOf(heights, heights.length);
        Arrays.sort(curr);

        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != curr[i]) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        HeightChecker checker = new HeightChecker();
        checker.heightChecker(new int[]{1, 5, 1, 2, 3, 4, 8, 9, 1});
    }
}
