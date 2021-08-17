package algorithms._0075_sort_colors;

/**
 * ** Created by peter.guan on 2021/08/17.
 *
 * @author peter.guan
 */
public class SortColors {

    public void sortColors(int[] nums) {
        int red = 0;
        int white = 0;
        for (int n : nums) {
            if (n == 0) {
                red++;
            }
            if (n == 1) {
                white++;
            }
        }
        int n = 0;
        for (int i = 0; i < red; i++) {
            nums[n++] = 0;
        }
        for (int i = 0; i < white; i++) {
            nums[n++] = 1;
        }
        for (int i = 0; i < nums.length - red - white; i++) {
            nums[n++] = 2;
        }

    }
}
