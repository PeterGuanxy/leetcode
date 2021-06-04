package algorithms._0016_three_sum_closest;

import java.util.Arrays;

/**
 * ** Created by peter.guan on 2021/06/04.
 *
 * @author peter.guan
 */
public class ThreeSumClosest {

    public int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);
        int value = Math.abs(nums[0] + nums[1] + nums[nums.length - 1] - target);
        int goalSum = nums[0] + nums[1] + nums[nums.length - 1];

        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                int abs = Math.abs(sum - target);
                // 记录下绝对值最小的合
                if (abs < value) {
                    value = abs;
                    goalSum = sum;
                }

                if (sum - target == 0) {
                    return target;
                } else if (sum - target > 0) {
                    k--;
                } else {
                    j++;
                }
            }
        }
        return goalSum;

    }
}
