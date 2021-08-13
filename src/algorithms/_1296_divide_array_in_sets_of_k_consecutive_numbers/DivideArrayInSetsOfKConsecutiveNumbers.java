package algorithms._1296_divide_array_in_sets_of_k_consecutive_numbers;

import java.util.Arrays;

/**
 * ** Created by peter.guan on 2021/08/13.
 *
 * @author peter.guan
 */
public class DivideArrayInSetsOfKConsecutiveNumbers {

    public boolean isPossibleDivide(int[] nums, int k) {

        Arrays.sort(nums);
        int[] buckets = new int[k];
        for (int i = 0; i < nums.length; i++) {
            if (i % k != 0 && nums[i] - nums[i - 1] > 1) {
                return false;
            }
            buckets[nums[i] % k]++;
        }

        for (int bucket : buckets) {
            if (bucket != buckets[0]) {
                return false;
            }
        }
        return true;
    }

}
