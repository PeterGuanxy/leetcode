package algorithms._0459_repeated_substring_pattern;

/**
 * ** Created by peter.guan on 2021/08/05.
 *
 * @author peter.guan
 */
public class RepeatedSubstringPattern {

    public boolean repeatedSubstringPattern(String s) {

        char[] chars = s.toCharArray();
        for (int i = 1; i <= chars.length / 2; i++) {
            if (chars.length % i != 0) {
                continue;
            }

            boolean check = true;
            for (int j = 0, k = j + i; k < chars.length; j++, k++) {
                if (chars[j] != chars[k]) {
                    check = false;
                    break;
                }
            }
            if (check) {
                return true;
            }
        }
        return false;
    }

}
