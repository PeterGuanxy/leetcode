package algorithms._1871_jump_game_7;

import java.util.LinkedList;
import java.util.Queue;

/**
 * ** Created by peter.guan on 2021/06/21.
 *
 * @author peter.guan
 */
public class JumpGame7 {

    public boolean canReach(String s, int minJump, int maxJump) {
        if (s.charAt(s.length() - 1) == '1') {
            return false;
        }

        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);

        int maxReach = 0;

        while (!queue.isEmpty()) {
            int idx = queue.remove();
            if (idx == s.length() - 1) {
                return true;
            }

            for (int j = Math.max(idx + minJump, maxReach); j <= Math.min(idx + maxJump, s.length() - 1); j++) {
                if (s.charAt(j) == '0') {
                    queue.add(j);
                }
            }

            maxReach = Math.min(idx + maxJump + 1, s.length() - 1);
        }

        return false;

//        return reach(s, minJump, maxJump, minJump, maxJump);
    }

    // time out
    public boolean reach(String s, int left, int right, int minJump, int maxJump) {
        if (left <= s.length() - 1 && s.length() - 1 <= right) {
            return true;
        } else if (left > s.length() - 1 || left == -1) {
            return false;
        }

        int currLeft = -1;
        int currRight = -1;
        for (int i = left; i <= right; i++) {
            if (s.charAt(i) == '0') {
                if (currLeft == 0) {
                    currLeft = minJump + i;
                }
                currRight = Math.max(currRight, maxJump + i);
            }
        }
        return reach(s, currLeft, currRight, minJump, maxJump);
    }
}
