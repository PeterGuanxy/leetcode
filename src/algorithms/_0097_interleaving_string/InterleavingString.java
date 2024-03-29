package algorithms._0097_interleaving_string;

/**
 * ** Created by peter.guan on 2021/08/16.
 *
 * @author peter.guan
 */
public class InterleavingString {

    public boolean isInterleave(String s1, String s2, String s3) {

        int n = s1.length(), m = s2.length(), t = s3.length();

        if (n + m != t) {
            return false;
        }

        boolean[] f = new boolean[m + 1];

        f[0] = true;
        for (int i = 0; i <= n; ++i) {
            for (int j = 0; j <= m; ++j) {
                int p = i + j - 1;
                if (i > 0) {
                    f[j] = f[j] && s1.charAt(i - 1) == s3.charAt(p);
                }
                if (j > 0) {
                    f[j] = f[j] || (f[j - 1] && s2.charAt(j - 1) == s3.charAt(p));
                }
            }
        }

        return f[m];
    }

    public static void main(String[] args) {
        InterleavingString inter = new InterleavingString();
        System.out.println(inter.isInterleave("aabcc", "dbbca", "aadbbcbcac"));
    }

}
