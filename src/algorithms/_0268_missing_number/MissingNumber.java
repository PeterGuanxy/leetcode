package algorithms._0268_missing_number;

/**
 * ** Created by peter.guan on 2021/07/06.
 *
 * @author peter.guan
 */
public class MissingNumber {

    public int missingNumber(int[] nums) {

        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        int sum1 = 0;
        for (int i = 0; i <= nums.length; i++) {
            sum1 += i;
        }
        return sum1 - sum;
    }
}
