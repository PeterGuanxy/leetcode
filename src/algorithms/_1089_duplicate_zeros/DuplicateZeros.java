package algorithms._1089_duplicate_zeros;

import java.util.Arrays;

/**
 * ** Created by peter.guan on 2021/08/26.
 *
 * @author peter.guan
 */
public class DuplicateZeros {

    public void duplicateZeros(int[] arr) {

        int len = arr.length;
        int[] res = new int[len];

        int n = 0;
        int k = 0;
        while (n < len) {
            if (arr[k] != 0) {
                res[n++] = arr[k++];
            } else {
                res[n++] = arr[k];
                if (n != len) {
                    res[n++] = arr[k++];
                }
            }
        }
        System.arraycopy(res, 0, arr, 0, len);
    }

    public static void main(String[] args) {
        DuplicateZeros duplicateZeros = new DuplicateZeros();
        duplicateZeros.duplicateZeros(new int[]{1, 2, 0, 3, 4, 0, 5});
    }

}
