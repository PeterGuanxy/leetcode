package algorithms._0018_four_sum;

import java.util.*;

/**
 * ** Created by peter.guan on 2021/06/04.
 *
 * @author peter.guan
 */
public class FourSum {

    public List<List<Integer>> fourSum(int[] nums, int target) {

        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j > i; j--) {
                int k = i + 1;
                int h = j - 1;

                while (k < h) {
                    int sum = nums[i] + nums[j] + nums[k] + nums[h];
                    if (sum - target == 0) {
                        set.add(Arrays.asList(nums[i], nums[k], nums[h], nums[j]));
                        while (k < h && nums[k] == nums[k + 1]) {
                            k++;
                        }
                        while (k < h && nums[h] == nums[h - 1]) {
                            h--;
                        }
                        k++;
                        h--;
                    } else if (sum - target > 0) {
                        h--;
                    } else {
                        k++;
                    }
                }
            }

        }
        return new ArrayList<>(set);
    }

    public List<List<Integer>> faster(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        if (n == 0) {
            return list;
        }
        for (int a = 0; a < n - 3; a++) {
            if (a > 0 && nums[a] == nums[a - 1]) {
                continue;
            }
            for (int d = n - 1; d > a + 2; d--) {
                if (d < n - 1 && nums[d] == nums[d + 1]) {
                    continue;
                }
                int b = a + 1;
                int c = d - 1;

                // 从小的这边走 最小的和大于目标值 则这轮跳过
                int min = nums[a] + nums[d] + nums[b] + nums[b + 1];
                if (min > target) {
                    continue;
                }
                // 从大的这边走 最大的都小于目标值了 则全部跳过
                int max = nums[a] + nums[d] + nums[c] + nums[c - 1];
                if (max < target) {
                    break;
                }
                while (c > b) {
                    int sum = nums[a] + nums[b] + nums[c] + nums[d];
                    if (sum > target) {
                        c--;
                    } else if (sum < target) {
                        b++;
                    } else {
                        list.add(Arrays.asList(nums[a], nums[b], nums[c], nums[d]));
                        while (c > b && nums[b] == nums[b + 1]) {
                            b++;
                        }
                        while (c > b && nums[c] == nums[c - 1]) {
                            c--;
                        }
                        b++;
                        c--;
                    }

                }
            }
        }
        return list;
    }
}
