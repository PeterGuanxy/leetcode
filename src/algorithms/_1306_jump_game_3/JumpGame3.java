package algorithms._1306_jump_game_3;

/**
 * ** Created by peter.guan on 2021/06/21.
 *
 * @author peter.guan
 */
public class JumpGame3 {

    public boolean canReach(int[] arr, int start) {
        int[] checkArr = new int[arr.length];
        return check(arr, checkArr, start);
    }

    public boolean check(int[] arr, int[] checkArr, int start) {
        if (start < 0 || start >= arr.length) {
            return false;
        }
        if (checkArr[start] == 1) {
            return false;
        }
        if (arr[start] == 0) {
            return true;
        }
        checkArr[start] = 1;
        return check(arr, checkArr, start - arr[start]) || check(arr, checkArr, start + arr[start]);
    }
}
