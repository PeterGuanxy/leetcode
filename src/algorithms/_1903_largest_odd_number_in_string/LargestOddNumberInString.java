package algorithms._1903_largest_odd_number_in_string;

/**
 * ** Created by peter.guan on 2021/09/02.
 *
 * @author peter.guan
 */
public class LargestOddNumberInString {

    public String largestOddNumber(String num) {

        int n = num.length() - 1;
        while (n >= 0) {
            if (num.charAt(n) % 2 == 1) {
                return num.substring(0, n + 1);
            }
            n--;
        }
        return "";

    }
}
