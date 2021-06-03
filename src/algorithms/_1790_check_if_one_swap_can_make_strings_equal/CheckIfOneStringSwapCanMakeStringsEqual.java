package algorithms._1790_check_if_one_swap_can_make_strings_equal;

/**
 * ** Created by peter.guan on 2021/06/03.
 *
 * @author peter.guan
 */
public class CheckIfOneStringSwapCanMakeStringsEqual {

    // 与0859类似，0859必须换一次，本题至多换一次

    public boolean checkFaster(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        if (s1.equals(s2)) {
            return true;
        }

        char s11 = '\0';
        char s12 = '\0';
        char s21 = '\0';
        char s22 = '\0';
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                count++;
                if (count == 1) {
                    s11 = s1.charAt(i);
                    s21 = s2.charAt(i);
                } else if (count == 2) {
                    s12 = s1.charAt(i);
                    s22 = s2.charAt(i);
                } else {
                    return false;
                }
            }
        }
        return s11 == s22 && s12 == s21;
    }

    public boolean areAlmostEqual(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        if (s1.equals(s2)) {
            return true;
        }

        int first = 0;
        int last = 0;
        int count = 0;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                count++;
                if (count == 1) {
                    first = i;
                }
                if (count == 2) {
                    last = i;
                    s1 = swap(s1, first, last);
                    return s1.equals(s2);
                }
            }
        }

        return false;
    }

    public String swap(String s, int first, int last) {
        char[] array = s.toCharArray();
        char temp = array[first];
        array[first] = array[last];
        array[last] = temp;
        return String.valueOf(array);
    }



}
