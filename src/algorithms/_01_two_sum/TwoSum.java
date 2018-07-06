package algorithms._01_two_sum;

import java.util.Arrays;

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


  public static void main(String[] args) {
    int[] nums = {1,4,10,20,40};
    int target = 60;
    System.out.println(Arrays.toString(twoSum(nums, target)));
  }
}
