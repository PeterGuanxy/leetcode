package algorithms._0278_first_bad_version;

/**
 * ** Created by peter.guan on 2021/06/11.
 *
 * @author peter.guan
 */
public class FirstBadVersion {

    boolean isBadVersion(int version) {
        return true;
    }

    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
