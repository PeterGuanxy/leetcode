package algorithms._0852_peak_index_in_a_mountain_array;

/**
 * ** Created by peter.guan on 2021/08/13.
 *
 * @author peter.guan
 */
public class PeakIndexInAMountainArray {

    public int peakIndexInMountainArray(int[] arr) {

        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] < arr[mid + 1] && arr[mid] > arr[mid - 1]) {
                left = mid;
            } else if (arr[mid] < arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                right = mid;
            } else {
                return mid;
            }
        }
        return left;
    }
}
