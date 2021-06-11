package algorithms._0034_find_first_and_last_position_of_element_in_sorted_array;

/**
 * ** Created by peter.guan on 2021/06/11.
 *
 * @author peter.guan
 */
public class FindFirstAndLastPositionOfElementInSortedArray {

    public int[] searchRange(int[] nums, int target) {

        if (nums.length == 0) {
            return new int[]{-1, -1};
        }
        if (nums.length == 1) {
            return nums[0] == target ? new int[]{0, 0} : new int[]{-1, -1};
        }

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                int i = mid;
                int j = mid;
                boolean a = true;
                boolean b = true;
                while (a || b) {
                    if (i == 0) {
                        a = false;
                    }
                    if (j == nums.length - 1) {
                        b = false;
                    }
                    if (a) {
                        i--;
                    }
                    if (b) {
                        j++;
                    }
                    if (nums[i] != target) {
                        i++;
                        a = false;
                    }
                    if (nums[j] != target) {
                        j--;
                        b = false;
                    }
                }
                return new int[]{i, j};
            }

            if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        FindFirstAndLastPositionOfElementInSortedArray find = new FindFirstAndLastPositionOfElementInSortedArray();
        System.out.println(find.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8));
    }

}
