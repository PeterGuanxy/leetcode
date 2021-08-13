package algorithms._0659_split_array_into_consecutive_subsequences;

import java.util.HashMap;
import java.util.Map;

/**
 * ** Created by peter.guan on 2021/08/13.
 *
 * @author peter.guan
 */
public class SplitArrayIntoConsecutiveSubsequences {

    public boolean isPossible(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();

        Map<Integer, Integer> needMap = new HashMap<>();

        for (int n : nums) {
            countMap.put(n, countMap.getOrDefault(n, 0) + 1);
        }

        for (int i = 0; i < nums.length; i++) {
            if (countMap.get(nums[i]) <= 0) {
                continue;
            }

            if (needMap.getOrDefault(nums[i], 0) > 0) {
                countMap.put(nums[i], countMap.get(nums[i]) - 1);
                needMap.put(nums[i], needMap.get(nums[i]) - 1);
                needMap.put(nums[i] + 1, needMap.getOrDefault(nums[i] + 1, 0) + 1);
            } else if (countMap.getOrDefault(nums[i] + 1, 0) > 0 && countMap.getOrDefault(nums[i] + 2, 0) > 0) {
                countMap.put(nums[i], countMap.get(nums[i]) - 1);
                countMap.put(nums[i] + 1, countMap.get(nums[i] + 1) - 1);
                countMap.put(nums[i] + 2, countMap.get(nums[i] + 2) - 1);
                needMap.put(nums[i] + 3, needMap.getOrDefault(nums[i] + 3, 0) + 1);
            } else {
                return false;
            }
        }
        return true;
    }

}
