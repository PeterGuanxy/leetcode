package algorithms._0792_Number_of_matching_subsequences;

import java.util.HashMap;
import java.util.Map;

/**
 * ** Created by peter.guan on 2021/08/05.
 *
 * @author peter.guan
 */
public class NumberOfMatchingSubsequences {

    public int numMatchingSubseq(String s, String[] words) {

        int res = 0;

        Map<String, Boolean> map = new HashMap<>();

        for (String t : words) {
            if (!map.containsKey(t)) {
                map.put(t, isSubsequence(t, s));
            }
            if (map.get(t)) {
                res++;
            }
        }
        return res;

    }

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
