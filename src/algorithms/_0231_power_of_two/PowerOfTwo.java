package algorithms._0231_power_of_two;

/**
 * ** Created by peter.guan on 2021/07/08.
 *
 * @author peter.guan
 */
public class PowerOfTwo {

    public boolean isPowerOfTwo(int n) {

        if (n == 1) {
            return true;
        }

        if (n == 0 || n % 2 != 0) {
            return false;
        }

        return isPowerOfTwo(n / 2);

    }
}
