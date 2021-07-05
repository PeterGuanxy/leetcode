package algorithms._0070_climbing_stairs;

/**
 * ** Created by peter.guan on 2021/07/05.
 *
 * @author peter.guan
 */
public class ClimbingStairs {

    public int climbStairs(int n) {
        int p = 0, q = 0, r = 1;
        for (int i = 1; i <= n; ++i) {
            p = q;
            q = r;
            r = p + q;
        }
        return r;
    }

}
