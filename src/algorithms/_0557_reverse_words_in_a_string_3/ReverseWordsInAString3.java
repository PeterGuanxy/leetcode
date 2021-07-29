package algorithms._0557_reverse_words_in_a_string_3;

/**
 * ** Created by peter.guan on 2021/07/29.
 *
 * @author peter.guan
 */
public class ReverseWordsInAString3 {

    public String reverseWords(String s) {

        String[] split = s.split(" ");
        for (int i = 0; i < split.length; i++) {
            split[i] = reverse(split[i]);
        }
        StringBuilder builder = new StringBuilder();
        for (String sub : split) {
            builder.append(sub).append(" ");
        }
        String res = builder.toString();
        return res.substring(0, res.length() - 1);
    }

    public String reverse(String str) {
        char[] chars = str.toCharArray();
        int i = 0;
        int j = chars.length - 1;
        while (j > i) {
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
        }
        return String.valueOf(chars);
    }

    public String faster(String s) {
        int len = s.length();
        if (len <= 1) {
            return s;
        }

        int start;
        int end;
        char[] chars = s.toCharArray();
        for (int i = 0; i < len; i++) {
            start = i;
            while (++i < len && chars[i] != ' ') {
            }

            end = i - 1;

            while (start < end) {
                char temp = chars[start];
                chars[start] = chars[end];
                chars[end] = temp;
            }

        }
        return String.valueOf(chars);
    }

}
