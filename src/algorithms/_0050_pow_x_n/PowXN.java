package algorithms._0050_pow_x_n;

/**
 * ** Created by peter.guan on 2021/07/01.
 *
 * @author peter.guan
 */
public class PowXN {

    // timeout
    public double timeout(double x, int n) {

        if (n == 0) {
            return 1;
        }
        double unit = x;
        if (n < 0) {
            n = Math.abs(n);
            unit = 1 / x;
            x = 1 / x;
        }

        for (int i = 1; i < n; i++) {
            x *= unit;
        }

        return x;
    }

    public double myPow(double x, int n) {
        if (n < 0) {
            n = n * (-1);
            double cal = x * myPow(x, n - 1);
            return 1 / cal;
        }
        if (n == 0) {
            return 1;
        }
        double powvalue = myPow(x, n / 2);
        if (n % 2 == 0) {
            return powvalue * powvalue;
        }
        return x * powvalue * powvalue;

    }
}
