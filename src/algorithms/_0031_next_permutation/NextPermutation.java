package algorithms._0031_next_permutation;

import java.util.Arrays;

/**
 * ** Created by peter.guan on 2021/07/01.
 *
 * @author peter.guan
 */
public class NextPermutation {

    public void nextPermutation(int[] nums) {

        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {
                Arrays.sort(nums, i, nums.length);
            }
            for (int j = i; j < nums.length; j++) {
                if (nums[j] > nums[i - 1]) {
                    int temp = nums[j];
                    nums[j] = nums[i - 1];
                    nums[i - 1] = temp;
                    return;
                }
            }
        }
        Arrays.sort(nums);
    }

}
