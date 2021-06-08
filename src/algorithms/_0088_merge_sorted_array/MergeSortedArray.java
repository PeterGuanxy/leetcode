package algorithms._0088_merge_sorted_array;

/**
 * ** Created by peter.guan on 2021/06/08.
 *
 * @author peter.guan
 */
public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums = new int[m + n];
        if (nums2.length == 0) {
            return;
        }

        int j = 0;
        int k = 0;
        int l = 0;
        while (j < m && k < n) {
            if (nums1[j] < nums2[k]) {
                nums[l++] = nums1[j++];
            } else {
                nums[l++] = nums2[k++];
            }
        }

        while (j < m) {
            nums[l++] = nums1[j++];
        }

        while (k < n) {
            nums[l++] = nums2[k++];
        }
        for (int i = 0; i < nums.length; i++) {
            nums1[i] = nums[i];
        }
    }

    // 倒排就不用重新给nums1赋值了，思路好
    public void mergeFaster(int[] nums1, int m, int[] nums2, int n) {
        if (nums2.length == 0) {
            return;
        }

        int j = m - 1;
        int k = n - 1;
        int l = m + n - 1;

        while (j >= 0 && k >= 0) {
            if (nums1[j] < nums2[k]) {
                nums1[l--] = nums2[k--];
            } else {
                nums1[l--] = nums1[j--];
            }
        }

        while (k >= 0) {
            nums1[l--] = nums2[k--];
        }
    }

    public static void main(String[] args) {
        MergeSortedArray sort = new MergeSortedArray();
        int[] nums = new int[]{1, 2, 3, 0, 0, 0};
        sort.mergeFaster(nums, 3, new int[]{4, 5, 6}, 3);
        for (int n : nums) {
            System.out.print(n + " ");
        }
    }
}
