package algorithms._1005__maximize_sum_of_array_after_k_negations;

import java.util.Arrays;

/**
 * ** Created by guanxy on 2022/6/15.
 *
 * @author guanxy
 */
public class MaximizeSumOfArrayAfterKNegations {

  public int largestSumAfterKNegations(int[] nums, int k) {

    Arrays.sort(nums);

    int minusCount = 0;
    for (int n : nums) {
      if (n < 0) {
        minusCount++;
        continue;
      }
      break;
    }

    int sum = 0;
    if (minusCount >= k) {
      int kcount = 0;
      for (int n : nums) {
        if (kcount < k) {
          sum += Math.abs(n);
          kcount++;
          continue;
        }
        sum += n;
      }
      return sum;
    }

    if ((k - minusCount) % 2 == 0 || Arrays.binarySearch(nums, 0) > 0) {
      for (int n : nums) {
        sum += Math.abs(n);
      }
      return sum;
    }

    int min = Integer.MAX_VALUE;
    for (int n : nums) {
      sum += Math.abs(n);
      min = Math.min(Math.abs(n), min);
    }
    return sum - min - min;
  }

  public static void main(String[] args) {
    int[] a = {1, 2, 3, 4, 5, 3, 2, 1, -1, -2, -5, -8};
    Arrays.sort(a);
    for (int n : a) {
      System.out.print(n);
      System.out.print(" ");
    }
  }


}
