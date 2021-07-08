package algorithms._0334_reverse_string;

/**
 * ** Created by peter.guan on 2021/07/08.
 *
 * @author peter.guan
 */
public class ReverseString {

    public void reverseString(char[] s) {
        int i = 0;
        int j = s.length - 1;
        char temp;
        while (i < j) {
            temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
    }
}
