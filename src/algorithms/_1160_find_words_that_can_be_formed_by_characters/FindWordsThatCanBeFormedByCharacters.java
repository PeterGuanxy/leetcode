package algorithms._1160_find_words_that_can_be_formed_by_characters;

import java.util.Arrays;

/**
 * ** Created by peter.guan on 2021/08/06.
 *
 * @author peter.guan
 */
public class FindWordsThatCanBeFormedByCharacters {

    public int countCharacters(String[] words, String chars) {

        int[] charsCount = new int[26];
        for (char a : chars.toCharArray()) {
            charsCount[a - 97]++;
        }

        int length = 0;

        out:
        for (String s : words) {

            int[] currCount = Arrays.copyOf(charsCount, 26);
            for (char a : s.toCharArray()) {
                currCount[a - 97]--;
                if (currCount[a - 97] < 0) {
                    continue out;
                }
            }

            length += s.length();
        }
        return length;
    }

}
