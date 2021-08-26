package algorithms._1304_find_n_unique_integers_sum_up_to_zero;

/**
 * ** Created by peter.guan on 2021/08/24.
 *
 * @author peter.guan
 */
public class FindNUniqueIntegersSumUpToZero {

    public int[] sumZero(int n) {
        int[] res = new int[n];
        if (n % 2 == 0) {
            int curr = 1;
            for (int i = 0; i < n - 1; i += 2) {
                res[i] = curr;
                res[i+1] = -curr;
                curr++;
            }
            return res;
        }

        int curr = 1;
        res[0] = 0;
        for (int i = 1; i< n-1;i+=2) {
            res[i] = curr;
            res[i+1] = -curr;
            curr++;
        }
        return res;
    }
}
