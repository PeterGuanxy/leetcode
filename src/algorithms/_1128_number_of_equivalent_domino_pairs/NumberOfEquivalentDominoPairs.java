package algorithms._1128_number_of_equivalent_domino_pairs;

/**
 * ** Created by peter.guan on 2021/08/19.
 *
 * @author peter.guan
 */
public class NumberOfEquivalentDominoPairs {

    public int numEquivDominoPairs(int[][] dominoes) {

        int[] counts = new int[100];
        int res = 0;

        for (int[] domino : dominoes) {
            int up = domino[0] > domino[1] ? domino[0] : domino[1];
            int down = domino[0] > domino[1] ? domino[1] : domino[0];

            res += counts[up * 10 + down]++;
        }
        return res;

    }

}
