package algorithms._0941_valid_mountain_array;

/**
 * ** Created by peter.guan on 2021/08/19.
 *
 * @author peter.guan
 */
public class ValidMountainArray {

    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3) {
            return false;
        }
        boolean check = true;
        boolean flag = false;
        int n = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                return false;
            }
            if (check) {
                if (arr[i] < arr[i - 1]) {
                    if (flag) {
                        return false;
                    }
                    flag = true;
                    check = false;
                    n++;
                } else {
                    if (n == 0) {
                        n++;
                    }
                }
            } else {
                if (arr[i] > arr[i - 1]) {
                    if (flag) {
                        return false;
                    }
                }
            }
        }
        return !check && flag && n == 2;
    }

}
