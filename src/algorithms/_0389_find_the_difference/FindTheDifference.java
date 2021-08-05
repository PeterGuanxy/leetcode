package algorithms._0389_find_the_difference;

import java.util.Arrays;

/**
 * ** Created by peter.guan on 2021/08/05.
 *
 * @author peter.guan
 */
public class FindTheDifference {

    public char findTheDifference(String s, String t) {
        if (s.length() == 0) {
            return t.toCharArray()[0];
        }

        char[] ss = s.toCharArray();
        char[] ts = t.toCharArray();
        Arrays.sort(ss);
        Arrays.sort(ts);

        for (int i = 0; i < ss.length; i++) {
            if (ss[i] != ts[i]) {
                return ts[i];
            }
        }

        return ts[ts.length - 1];
    }

    /**
     * faster 0ms  beat 100%
     */
    public char countMethods(String s, String t) {
        if (s.length() == 0) {
            return t.toCharArray()[0];
        }
        char[] ss = s.toCharArray();
        char[] ts = t.toCharArray();
        int counts = 0;
        int countt = 0;
        for (int i = 0; i < ss.length; i++) {
            counts += ss[i];
            countt += ts[i];
        }
        countt += ts[ts.length - 1];

        return (char) (countt - counts);
    }

    public static void main(String[] args) {
        FindTheDifference findTheDifference = new FindTheDifference();
        findTheDifference.countMethods("abcd", "abcde");
    }
}
