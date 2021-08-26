package algorithms._1013_partition_array_into_three_parts_with_equal_sum;

/**
 * ** Created by peter.guan on 2021/08/24.
 *
 * @author peter.guan
 */
public class PartitionArrayIntoThreePartsWithEqualSum {

    public boolean canThreePartsEqualSum(int[] arr) {

        int sum = 0;
        for (int n : arr) {
            sum += n;
        }

        if (sum % 3 != 0) {
            return false;
        }

        int count = 0;
        int curr = 0;

        for (int n : arr) {
            if (count == 2) {
                return true;
            }

            curr += n;
            if (curr == sum / 3) {
                curr = 0;
                count++;
            }
        }

        return false;
    }
}
