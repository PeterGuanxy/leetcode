package algorithms._0035_search_insert_position;


/**
 * ** Created by peter.guan on 2021/06/11.
 *
 * @author peter.guan
 */
public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}
