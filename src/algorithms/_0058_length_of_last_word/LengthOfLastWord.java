package algorithms._0058_length_of_last_word;

/**
 * ** Created by peter.guan on 2021/06/15.
 *
 * @author peter.guan
 */
public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {

        String[] arr = s.split(" ");
        if (arr.length == 0) {
            return 0;
        }
        return arr[arr.length - 1].length();

    }

    public int faster(String s) {
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ' && count != 0) {
                break;
            }

            if (s.charAt(i) != ' ') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String a = "    ";
        System.out.println(a.split(" ").length);
    }


}
