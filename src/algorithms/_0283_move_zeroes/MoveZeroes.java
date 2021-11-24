package algorithms._0283_move_zeroes;

/**
 * ** Created by peter.guan on 2021/11/24.
 *
 * @author peter.guan
 */
public class MoveZeroes {

    public void moveZeroes(int[] nums) {

        int slow = 0;
        for (int fast = 0; fast < nums.length; fast++) {
            if (nums[fast] != 0) {
                nums[slow++] = nums[fast];
            }
        }
        for (int i = slow; i< nums.length; i++) {
            nums[i] = 0;
        }

    }
}
