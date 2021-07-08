package algorithms._0342_power_of_four;

/**
 * ** Created by peter.guan on 2021/07/08.
 *
 * @author peter.guan
 */
public class PowerOfFour {

    public boolean isPowerOfFour(int n) {

        if (n == 0) {
            return false;
        }

        if (n == 1) {
            return true;
        }

        if (n % 4 != 0) {
            return false;
        }
        return isPowerOfFour(n / 4);

    }
}
