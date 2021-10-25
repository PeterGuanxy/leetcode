package algorithms._0387_first_unique_character_in_a_string;

/**
 * ** Created by peter.guan on 2021/10/25.
 *
 * @author peter.guan
 */
public class FirstUniqueCharacterInAString {

    public int firstUniqChar(String s) {

        int[] arr = new int[26];
        for (char c : s.toCharArray()) {
            arr[c - 97]++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (arr[s.charAt(i) - 97] == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        FirstUniqueCharacterInAString a = new FirstUniqueCharacterInAString();
        a.firstUniqChar("leetcode");
    }

}
