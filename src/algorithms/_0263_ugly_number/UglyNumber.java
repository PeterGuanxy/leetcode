package algorithms._0263_ugly_number;

/**
 * ** Created by peter.guan on 2021/07/06.
 *
 * @author peter.guan
 */
public class UglyNumber {

    public boolean isUgly(int n) {

        if (n == 0) {
            return false;
        }

        for (int i = 2; i < 6; i++) {
            while (n % i == 0) {
                n /= i;
            }
        }
        return n == 1;
    }
}
