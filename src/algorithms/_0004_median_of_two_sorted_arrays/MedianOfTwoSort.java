package algorithms._0004_median_of_two_sorted_arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * description
 *
 * @author guanxy
 * @date 2018/7/9
 */
public class MedianOfTwoSort {

  public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
    List<Integer> list1 = Arrays.stream(nums1).boxed().collect(Collectors.toList());
    List<Integer> list2 = Arrays.stream(nums2).boxed().collect(Collectors.toList());

    List<Integer> list = new ArrayList();
    list.addAll(list1);
    list.addAll(list2);
    Integer[] arr = list.toArray(new Integer[0]);
    Arrays.sort(arr);

    int length = arr.length;
    if (length%2 != 0) {
      return arr[length/2];
    } else {
      return ((double)(arr[length / 2 - 1]+arr[length/2]) / 2);
    }
  }

  public static void main(String[] args) {
    int[] num = {1,3};
    int[] num2 = {2};

    System.out.println(findMedianSortedArrays(num,num2));
  }
}
