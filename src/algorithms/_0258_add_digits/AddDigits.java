package algorithms._0258_add_digits;

/**
 * ** Created by peter.guan on 2021/07/08.
 *
 * @author peter.guan
 */
public class AddDigits {

    public int addDigits(int num) {

        while (num % 10 != num) {
            int curr = num;
            num = 0;
            while (curr > 0) {
                num += curr % 10;
                curr /= 10;
            }
        }

        return num;
    }
}
