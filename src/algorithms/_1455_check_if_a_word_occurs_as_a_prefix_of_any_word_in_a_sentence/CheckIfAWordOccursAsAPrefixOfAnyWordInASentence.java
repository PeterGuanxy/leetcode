package algorithms._1455_check_if_a_word_occurs_as_a_prefix_of_any_word_in_a_sentence;

/**
 * ** Created by peter.guan on 2021/08/23.
 *
 * @author peter.guan
 */
public class CheckIfAWordOccursAsAPrefixOfAnyWordInASentence {

    public int isPrefixOfWord(String sentence, String searchWord) {

        if (!sentence.contains(searchWord)) {
            return -1;
        }

        String[] arrs = sentence.split(" ");

        for (int i = 0; i < arrs.length; i++) {
            if (arrs[i].length() < searchWord.length()) {
                continue;
            }

            if (arrs[i].substring(0, searchWord.length()).equals(searchWord)) {
                return i + 1;
            }
        }

        return -1;
    }


}
