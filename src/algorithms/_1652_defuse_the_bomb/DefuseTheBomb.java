package algorithms._1652_defuse_the_bomb;

/**
 * ** Created by peter.guan on 2021/11/11.
 *
 * @author peter.guan
 */
public class DefuseTheBomb {

    public int[] decrypt(int[] code, int k) {
        int[] res = new int[code.length];
        if (k == 0) {
            return res;
        }

        if (k > 0) {
            for (int i = 0; i < code.length; i++) {
                int sum = 0;
                for (int j = 1; j <= k; j++) {
                    if (i + j - code.length >= 0) {
                        sum += code[i + j - code.length];
                    } else {
                        sum += code[i + j];
                    }
                }
                res[i] = sum;
            }
        }

        if (k < 0) {
            for (int i = 0; i < code.length; i++) {
                int sum = 0;
                for (int j = 1; j <= -k; j++) {
                    if (i - j < 0) {
                        sum += code[code.length + i - j];
                    } else {
                        sum += code[i - j];
                    }
                }
                res[i] = sum;
            }
        }

        return res;
    }
}
