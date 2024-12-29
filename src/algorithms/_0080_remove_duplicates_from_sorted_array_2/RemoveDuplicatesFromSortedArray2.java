package algorithms._0080_remove_duplicates_from_sorted_array_2;

import java.awt.print.Printable;

/**
 * ** Created by Peter on 2024/12/29.
 *
 * @author Peter
 */
public class RemoveDuplicatesFromSortedArray2 {

  public int removeDuplicates(int[] nums) {

    if (nums.length <= 2) {
      return nums.length;
    }

    int slow = 2;
    int fast = 2;
    while (fast < nums.length) {

      if (nums[fast] != nums[slow - 2]) {
        nums[slow] = nums[fast];
        slow++;
      }
      fast++;
    }
    return slow;

  }

  public int removeDuplicatesSlow(int nums[]) {
    if (nums.length <= 2) {
      return nums.length;
    }

    int i = 0;
    int j = 0;
    int count = 0;
    int current = nums[i];
    while (j < nums.length) {
      if (nums[i] != current) {
        current = nums[i];
        count = 0;
      }
      if (nums[i] == nums[j] & count < 2) {
        j++;
        i++;
        count++;
      } else if (nums[i] == nums[j] & count >= 2) {
        j++;
        count++;
      } else {
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
        current = nums[i];
        for (int k = i; k <= j; k++) {
          nums[k] = nums[i];
        }
        i++;
        j++;
        count = 1;
      }
    }
    return i;
  }

  public static void main(String[] args) {
    int[] nums = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 4,
        5, 6, 7, 8, 9, 10, 10, 10, 111, 233, 333, 5654};
//    int[] nums = {1, 1, 1, 2, 2, 2, 3, 3};
    RemoveDuplicatesFromSortedArray2 func = new RemoveDuplicatesFromSortedArray2();
    int n = func.removeDuplicates(nums);
    System.out.println(n);
    for (int i = 0; i < n; i++) {
      System.out.print(nums[i] + " ");
    }
  }


}
