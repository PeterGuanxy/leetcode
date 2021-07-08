package algorithms._0326_power_of_three;

/**
 * ** Created by peter.guan on 2021/07/08.
 *
 * @author peter.guan
 */
public class PowerOfThree {

    public boolean isPowerOfThree(int n) {
        if (n == 1) {
            return true;
        }

        if (n == 0 || n % 3 != 0) {
            return false;
        }

        return isPowerOfThree(n / 3);
    }

}
