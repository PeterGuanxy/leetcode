package algorithms._0860_lemonade_change;

/**
 * ** Created by peter.guan on 2021/08/06.
 *
 * @author peter.guan
 */
public class LemonadeChange {

    public boolean lemonadeChange(int[] bills) {

        int five = 0;
        int ten = 0;

        for (int n : bills) {

            if (n == 5) {
                five++;
                continue;
            }

            if (n == 10) {
                ten++;
                if (five == 0) {
                    return false;
                }
                five--;
                continue;
            }

            if (n == 20) {

                if (five == 0 || (ten==0&&five<3)) {
                    return false;
                }
                if (ten != 0) {
                    ten--;
                    five--;
                    continue;
                }

                five -= 3;
            }

        }
        return true;
    }

}
