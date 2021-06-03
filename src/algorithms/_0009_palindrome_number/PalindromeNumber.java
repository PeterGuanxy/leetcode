package algorithms._0009_palindrome_number;

/**
 * ** Created by peter.guan on 2021/06/02.
 *
 * @author peter.guan
 */
public class PalindromeNumber {

    public static boolean isPalindromeNumber(int x) {
        if (x < 0) {
            return false;
        }
        int a = x;
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            rev = rev * 10 + pop;
        }

        if (a == rev) {
            return true;
        }
        return false;
    }

    public static boolean better(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int rever = 0;
        while (x > rever) {
            rever = rever * 10 + x % 10;
            x /= 10;
        }

        return x == rever || x == rever / 10;
    }

    public static void main(String[] args) {
        System.out.println(isPalindromeNumber(1591951));
    }
}
