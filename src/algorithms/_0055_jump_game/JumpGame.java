package algorithms._0055_jump_game;

/**
 * ** Created by peter.guan on 2021/06/21.
 *
 * @author peter.guan
 */
public class JumpGame {

    public boolean canJump(int[] nums) {
        if (nums.length <= 1) {
            return true;
        }

        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (max < i) {
                return false;
            }

            max = Math.max(max, i + nums[i]);
            if (max >= nums.length - 1) {
                return true;
            }
        }
        return false;
    }
}
