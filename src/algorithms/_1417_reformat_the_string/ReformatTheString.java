package algorithms._1417_reformat_the_string;

/**
 * ** Created by peter.guan on 2021/06/15.
 *
 * @author peter.guan
 */
public class ReformatTheString {

    public String reformat(String s) {

        int lettersCount = 0;
        int digitsCount = 0;
        for (char a : s.toCharArray()) {
            if ('a' <= a && a <= 'z') {
                lettersCount++;
            } else {
                digitsCount++;
            }
        }
        if (Math.abs(lettersCount - digitsCount) > 1) {
            return "";
        }
        char[] chars = new char[s.length()];

        int i = 0, j = 0;
        if (lettersCount > digitsCount) {
            j = 1;
        } else {
            i = 1;
        }

        for (int k = 0; k < s.length(); k++) {
            char a = s.charAt(k);
            if ('a' <= a && a <= 'z') {
                chars[i] = a;
                i += 2;
            } else {
                chars[j] = a;
                j += 2;
            }
        }
        return String.valueOf(chars);
    }

    public static void main(String[] args) {
        char a = 'a';
        char b = 'b';
        System.out.println(a - b);
    }

}
