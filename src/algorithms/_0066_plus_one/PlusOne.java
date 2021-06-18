package algorithms._0066_plus_one;

/**
 * ** Created by peter.guan on 2021/06/18.
 *
 * @author peter.guan
 */
public class PlusOne {

    public int[] plusOne(int[] digits) {

        int sign = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            int res = digits[i] + sign;
            sign = 0;
            digits[i] = res;
            if (res > 9) {
                digits[i] = 0;
                sign = 1;
            } else {
                break;
            }
        }
        if (sign == 1) {
            int[] result = new int[digits.length + 1];
            System.arraycopy(digits, 0, result, 1, digits.length);
            result[0] = sign;
            return result;
        }
        return digits;
    }

    public static void main(String[] args) {
        PlusOne plusOne = new PlusOne();
        plusOne.plusOne(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0});
//        System.out.println(Math.pow(10, 3));
    }


}
