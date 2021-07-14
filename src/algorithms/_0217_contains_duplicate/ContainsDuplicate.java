package algorithms._0217_contains_duplicate;

import java.util.Arrays;

/**
 * ** Created by peter.guan on 2021/07/14.
 *
 * @author peter.guan
 */
public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i+1]) {
                return true;
            }
        }
        return false;

    }

}
