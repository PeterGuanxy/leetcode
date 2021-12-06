package algorithms._1769_minimum_number_of_operations_to_move_all_balls_to_each_box;

/**
 * ** Created by peter.guan on 2021/12/06.
 *
 * @author peter.guan
 */
public class MinimumNumberOfOperationsToMoveAllBallsToEachBox {

    public int[] minOperations(String boxes) {

        int[] res = new int[boxes.length()];
        for (int i = 0; i < boxes.length(); i++) {
            if (boxes.charAt(i) == '1') {
                for (int j = 0; j < boxes.length(); j++) {
                    res[j] += Math.abs(j - i);
                }
            }
        }

        return res;

    }

    public int[] faster(String boxes) {
        int n = boxes.length();
        int[] prefix = new int[n];
        int[] suffix = new int[n];

        int count = 0;
        if (boxes.charAt(0) == '1') {
            count++;
        }

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + count;

            if (boxes.charAt(i) == '1') {
                count++;
            }
        }

        count = 0;
        if (boxes.charAt(n - 1) == '1') {
            count++;
        }

        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] + count;
            if (boxes.charAt(i) == '1') {
                count++;
            }
        }

        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = prefix[i] + suffix[i];
        }

        return res;

    }
}
