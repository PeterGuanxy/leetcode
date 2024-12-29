package algorithms._2099__find_subsequence_of_length_k_with_the_largest_sum;

import java.util.Arrays;

/**
 * ** Created by guanxy on 2022/6/15.
 *
 * @author guanxy
 */
public class FindSubsequenceOfLengthKWithTheLargestSum {

  public int[] maxSubsequence(int[] nums, int k) {
    if (nums.length == 1 || nums.length == k) {
      return nums;
    }

    int[] res = new int[k];

    int[] copy = Arrays.copyOf(nums, nums.length);
    Arrays.sort(copy);

    int minPosition = nums.length - k - 1;
    int min = copy[minPosition];
    int minNums = 0;
    while (minPosition < nums.length - 1) {
      if (min == copy[++minPosition]) {
        minNums++;
        continue;
      }
      break;
    }

    int position = 0;
    int minCount = 0;
    for (int n : nums) {
      if (position == nums.length) {
        break;
      }
      if (n > min) {
        res[position++] = n;
        continue;
      }
      if (n == min && minNums != 0 && minCount < minNums) {
        res[position++] = n;
        minCount++;
      }
    }

    return res;
  }

  public static void main(String[] args) {
    int[] a = {3, 2, 1};
    int[] b = Arrays.copyOf(a, a.length);
    Arrays.sort(b);

    for (int n : a) {
      System.out.print(n);
    }
    System.out.println();
    for (int n : b) {
      System.out.print(n);
    }
  }

}
