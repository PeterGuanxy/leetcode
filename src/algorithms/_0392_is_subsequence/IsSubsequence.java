package algorithms._0392_is_subsequence;

/**
 * ** Created by peter.guan on 2021/08/05.
 *
 * @author peter.guan
 */
public class IsSubsequence {

    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) {
            return true;
        }

        char[] ss = s.toCharArray();
        char[] ts = t.toCharArray();

        int i = 0;
        for (int j = 0; j < ts.length; j++) {
            if (ss[i] == ts[j]) {
                i++;
                if (i == ss.length) {
                    return true;
                }
            }
        }

        return false;

    }
}
