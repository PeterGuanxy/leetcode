package algorithms._1460_make_two_arrays_equal_by_reversing_sub_arrays;

import java.util.Arrays;

/**
 * ** Created by peter.guan on 2021/08/12.
 *
 * @author peter.guan
 */
public class MakeTwoArraysEqualByReversingSubArrays {

    public boolean canBeEqual(int[] target, int[] arr) {

        Arrays.sort(target);
        Arrays.sort(arr);

        for (int i = 0; i < target.length; i++) {
            if (target[i] != arr[i]) {
                return false;
            }
        }
        return true;
    }
}
