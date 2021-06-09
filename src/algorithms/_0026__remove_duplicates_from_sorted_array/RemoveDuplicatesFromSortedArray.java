package algorithms._0026__remove_duplicates_from_sorted_array;

/**
 * ** Created by peter.guan on 2021/06/08.
 *
 * @author peter.guan
 */
public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                nums[++j] = nums[i];
            }
        }
        return ++j;
    }
}
