package algorithms._0015_three_sum;

import java.util.*;

/**
 * ** Created by peter.guan on 2021/06/04.
 *
 * @author peter.guan
 */
public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {

        if (nums.length < 3) {
            return new ArrayList<>();
        }
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();

        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    set.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                } else if (sum > 0) {
                    k--;
                } else {
                    j++;
                }
            }
        }
        return new ArrayList<>(set);
    }

    public List<List<Integer>> faster(int[] nums) {
        List<List<Integer>> li = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || nums[i - 1] != nums[i]) {
                int low = i + 1;
                int high = nums.length - 1;
                int sum = -nums[i];
                // 如果nums[1]已经是正数了，三数之和不可能是0，因为从小到大排序
                if (sum >= 0) {
                    while (low < high) {
                        if (nums[low] + nums[high] == sum) {
                            li.add(Arrays.asList(nums[i], nums[low], nums[high]));
                            while (low < high && nums[low] == nums[low + 1]) {
                                low++;
                            }
                            while (low < high && nums[high] == nums[high - 1]) {
                                high--;
                            }
                            low++;
                            high--;
                        } else if (nums[low] + nums[high] > sum) {
                            high--;
                        } else {
                            low++;
                        }
                    }
                }
            }
        }
        return li;
    }
}
