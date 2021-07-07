package algorithms._0290_word_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * ** Created by peter.guan on 2021/07/07.
 *
 * @author peter.guan
 */
public class WordPattern {

    public boolean wordPattern(String pattern, String s) {

        char[] patterns = pattern.toCharArray();
        String[] strs = s.split(" ");
        if (patterns.length != strs.length) {
            return false;
        }
        String[] table = new String[26];
        List<String> list = new ArrayList<>();
        for (int i = 0; i < patterns.length; i++) {
            if (table[patterns[i] - 'a'] != null) {
                if (!table[patterns[i] - 'a'].equals(strs[i])) {
                    return false;
                }
            } else {
                if (list.contains(strs[i])) {
                    return false;
                }
                table[patterns[i] - 'a'] = strs[i];
                list.add(strs[i]);
            }
        }
        return true;
    }
}
