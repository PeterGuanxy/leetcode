package algorithms._0069_sqrt_x;

/**
 * ** Created by peter.guan on 2021/07/01.
 *
 * @author peter.guan
 */
public class SqrtX {

    public int mySqrt(int x) {
        if (x <= 1) {
            return x;
        }

        int start = 0;
        int end = x / 2;
        int mid;

        while (start <= end) {
            mid = (start + end) / 2;
            if (mid == x / mid) {
                return mid;
            }
            if (mid < x / mid) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start - 1;
    }

    public static void main(String[] args) {

    }
}
