package algorithms._1217_minimum_cost_to_move_chips_to_the_same_position;

/**
 * ** Created by peter.guan on 2021/12/06.
 *
 * @author peter.guan
 */
public class MinimumCostToMoveChipsToTheSamePosition {

    public int minCostToMoveChips(int[] position) {

        int odd = 0;
        int even = 0;

        for (int n : position) {
            if (n % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        return Math.min(odd, even);


    }
}
