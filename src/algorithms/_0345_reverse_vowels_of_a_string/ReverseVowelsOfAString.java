package algorithms._0345_reverse_vowels_of_a_string;

import java.util.Arrays;
import java.util.List;

/**
 * ** Created by peter.guan on 2021/07/08.
 *
 * @author peter.guan
 */
public class ReverseVowelsOfAString {

    public String reverseVowels(String s) {

        List<Character> vowelList = Arrays.asList('a', 'i', 'o', 'u', 'e', 'A', 'E', 'I', 'O', 'U');
        int i = 0;
        int j = s.length() - 1;
        char[] strs = s.toCharArray();
        char temp;
        while (i < j) {
            if (vowelList.contains(strs[i]) && vowelList.contains(strs[j])) {
                temp = strs[i];
                strs[i] = strs[j];
                strs[j] = temp;
                i++;
                j--;
            } else if (vowelList.contains(strs[i]) && !vowelList.contains(strs[j])) {
                j--;
            } else if (!vowelList.contains(strs[i]) && vowelList.contains(strs[j])) {
                i++;
            } else {
                i++;
                j--;
            }

        }
        return String.valueOf(strs);
    }
}
