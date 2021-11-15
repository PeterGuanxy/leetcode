package algorithms._0368_largest_divisible_subset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * description
 *
 * @author Peter Guan
 * @date 2021/11/15
 */
public class LargestDivisibleSubset {

  public List<Integer> largestDivisibleSubset(int[] nums) {

    Arrays.sort(nums);
    int[] f = new int[nums.length];
    int[] g = new int[nums.length];

    for (int i = 0; i < nums.length; i++) {
      int len = 1;
      int prev = i;
      for (int j = 0; j < i; j++) {
        if (nums[i] % nums[j] == 0) {
          if (f[j] + 1 > len) {
            len = f[j] + 1;
            prev = j;
          }
        }
      }
      f[i] = len;
      g[i] = prev;
    }

    int max = -1;
    int idx = -1;
    for (int i = 0; i < nums.length; i++) {
      if (f[i] > max) {
        max = f[i];
        idx = i;
      }
    }

    List<Integer> answer = new ArrayList<>();
    while (answer.size() != max) {
      answer.add(nums[idx]);
      idx = g[idx];
    }
    return answer;

  }

}
