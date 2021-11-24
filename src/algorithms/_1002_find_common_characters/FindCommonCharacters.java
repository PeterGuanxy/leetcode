package algorithms._1002_find_common_characters;

import java.util.ArrayList;
import java.util.List;

/**
 * ** Created by peter.guan on 2021/11/24.
 *
 * @author peter.guan
 */
public class FindCommonCharacters {

    public List<String> commonChars(String[] words) {

        int[] arr = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        int[] counts;
        for (String word : words) {
            char[] chars = word.toCharArray();
            counts = new int[26];
            for (char c : chars) {
                counts[c - 'a']++;
            }
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == -1) {
                    arr[i] = counts[i];
                    continue;
                }
                arr[i] = Math.min(arr[i], counts[i]);
            }
        }

        List<String> res = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i]; j++) {
                res.add(String.valueOf((char) ('a' + i)));
            }

        }
        return res;
    }

    public static void main(String[] args) {
        FindCommonCharacters find = new FindCommonCharacters();
        List<String> res = find.commonChars(new String[]{"cool", "lock", "cook"});
        for (String s : res) {
            System.out.println(s);
        }
    }
}
