package algorithms._0754_reach_a_number;

/**
 * ** Created by peter.guan on 2021/07/19.
 *
 * @author peter.guan
 */
public class ReachANumber {

    public int reachNumber(int target) {

        int moves = 0;
        int sum = 0;
        target = Math.abs(target);
        while (sum < target || (sum - target) % 2 != 0) {
            moves++;
            sum += moves;
        }
        return moves;
    }


    public static void main(String[] args) {
        ReachANumber reachANumber = new ReachANumber();
        reachANumber.reachNumber(123);
    }

}
