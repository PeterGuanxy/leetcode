package algorithms._0219_contains_duplicate_2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * ** Created by peter.guan on 2021/07/14.
 *
 * @author peter.guan
 */
public class ContainsDuplicate2 {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                if (Math.abs(i - map.get(nums[i])) <= k) {
                    return true;
                }
            }
            map.put(nums[i], i);
        }
        return false;

    }

    public boolean faster(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();

        int i = 0;
        while (i < nums.length) {
            if (i > k) {
                set.remove(nums[i - k - 1]);
            }
            if (!set.add(nums[i++])) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicate2 test = new ContainsDuplicate2();
        test.containsNearbyDuplicate(new int[]{1, 2, 3, 1, 2, 3}, 2);
    }
}
