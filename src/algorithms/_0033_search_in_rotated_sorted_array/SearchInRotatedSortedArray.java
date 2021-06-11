package algorithms._0033_search_in_rotated_sorted_array;

/**
 * ** Created by peter.guan on 2021/06/11.
 *
 * @author peter.guan
 */
public class SearchInRotatedSortedArray {

    public int search(int[] nums, int target) {

        if (nums.length == 1) {
            return nums[0] == target ? 0 : -1;
        }

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (right + left) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] >= nums[left]) {
                if (nums[mid] > target && nums[left] <= target) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (target > nums[mid] && nums[right] >= target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        SearchInRotatedSortedArray sortedArray = new SearchInRotatedSortedArray();
        System.out.println(sortedArray.search(new int[]{5, 1, 3}, 5));
    }

}