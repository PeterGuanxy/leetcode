package algorithms._1935_maximum_number_of_words_you_can_type;

/**
 * ** Created by peter.guan on 2021/08/24.
 *
 * @author peter.guan
 */
public class MaximumNumberOfWordsYouCanType {

    public int canBeTypedWords(String text, String brokenLetters) {

        String[] arr = text.split(" ");
        if (brokenLetters.length() == 0) {
            return arr.length;
        }

        if (brokenLetters.length() == 26) {
            return 0;
        }

        int res = 0;
        out:
        for (String str : arr) {
            for (char c : brokenLetters.toCharArray()) {
                if (str.indexOf(c) >= 0) {
                    continue out;
                }
            }
            res++;
        }
        return res;
    }

}
