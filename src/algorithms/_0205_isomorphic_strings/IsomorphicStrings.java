package algorithms._0205_isomorphic_strings;

/**
 * ** Created by peter.guan on 2021/07/07.
 *
 * @author peter.guan
 */
public class IsomorphicStrings {

    public boolean isIsomorphic(String s, String t) {
        int[] s1 = new int[128];
        int[] t1 = new int[128];
        for (int i = 0; i < s.length(); i++) {

            if (s1[s.charAt(i)] != t1[t.charAt(i)]) {
                return false;
            }
            s1[s.charAt(i)] = i + 1;
            t1[t.charAt(i)] = i + 1;

        }
        return true;
    }

    public static void main(String[] args) {
        char[] a = new char[26];
        System.out.println(a[1] == '\0');
    }
}
