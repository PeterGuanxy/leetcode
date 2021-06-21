package algorithms._0045_jump_game_2;

/**
 * ** Created by peter.guan on 2021/06/21.
 *
 * @author peter.guan
 */
public class JumpGame2 {

    public int jump(int[] nums) {

        int max = 0;
        int end = 0;
        int step = 0;
        int now = 0;
        int n = nums.length - 1;

        while (end < n) {
            max = Math.max(max, now + nums[now]);
            if (now == end) {
                step++;
                end = max;
            }
            now++;
        }
        return step;
    }
}
