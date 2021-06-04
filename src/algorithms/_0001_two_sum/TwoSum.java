package algorithms._0001_two_sum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * ** Created by guanxy on 2018/7/6.
 *
 * @author guanxy
 */
public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        int[] sort = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    sort[0] = i;
                    sort[1] = j;
                    return sort;
                }
            }
        }
        return null;
    }

    public int[] twoSumFaster(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int potentialMatch = target - nums[i];
            if (map.containsKey(potentialMatch))
                return new int[]{map.get(potentialMatch), i};
            map.put(nums[i], i);
        }
        return new int[]{0, 0};
    }


    public static void main(String[] args) {
        int[] nums = {1, 4, 10, 20, 40};
        int target = 60;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
}
