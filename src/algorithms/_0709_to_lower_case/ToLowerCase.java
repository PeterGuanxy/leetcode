package algorithms._0709_to_lower_case;

/**
 * ** Created by peter.guan on 2021/08/05.
 *
 * @author peter.guan
 */
public class ToLowerCase {

    public String toLowerCase(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 65 && chars[i] <= 90) {
                chars[i] = (char) (chars[i] + 32);
            }
        }

        return String.valueOf(chars);
    }

    public static void main(String[] args) {
        System.out.println('a' + 0);
        System.out.println('z' + 0);
        System.out.println('A' + 0);
        System.out.println('Z' + 0);
    }

}
