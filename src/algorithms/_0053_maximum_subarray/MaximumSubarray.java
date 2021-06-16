package algorithms._0053_maximum_subarray;

/**
 * ** Created by peter.guan on 2021/06/16.
 *
 * @author peter.guan
 */
public class MaximumSubarray {

    public int maxSubArray(int[] nums) {

        int sum = nums[0];
        int maxSum = nums[0];

        for (int i = 0; i < nums.length; i++) {
            sum = Math.max(nums[i], nums[i] + sum);
            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }

}
