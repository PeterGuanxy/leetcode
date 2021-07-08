package algorithms._0409_longest_palindrome;

import java.util.HashMap;
import java.util.Map;

/**
 * ** Created by peter.guan on 2021/07/08.
 *
 * @author peter.guan
 */
public class LongestPalindrome {

    public int longestPalindrome(String s) {

        char[] strs = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : strs) {
            int count = map.getOrDefault(c, 0);
            count++;
            map.put(c, count);
        }

        int sum = 0;
        for (char c : map.keySet()) {
            int count = map.get(c);
            if (count == 1) {
                continue;
            }
            if (count % 2 != 0) {
                count--;
            }
            sum += count;
        }
        return sum == s.length() ? sum : sum + 1;

    }

    public int faster(String s) {
        char[] strs = s.toCharArray();
        int[] count = new int[58];

        for (char c : strs) {
            count[c - 'A']++;
        }

        int sum = 0;
        for (int n : count) {
            if (n == 1) {
                continue;
            }
            if (n % 2 != 0) {
                n--;
            }
            sum += n;
        }
        return sum == s.length() ? sum : sum + 1;
    }
}
