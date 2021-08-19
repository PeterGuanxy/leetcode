package algorithms._1071_greatest_common_divisor_of_strings;

/**
 * ** Created by peter.guan on 2021/08/19.
 *
 * @author peter.guan
 */
public class GreatestCommonDivisorOfStrings {

    public String gcdOfStrings(String str1, String str2) {

        while (!str2.isEmpty()) {
            if (str1.equals(str2)) {
                return str1;
            }

            if (str1.length() < str2.length()) {
                String temp = str1;
                str1 = str2;
                str2 = temp;
            }

            if (str2.equals(str1.substring(0, str2.length()))) {
                String rest = str1.substring(str2.length());

                str1 = str2;
                str2 = rest;
            } else {
                return "";
            }
        }

        return str1;
    }
}
