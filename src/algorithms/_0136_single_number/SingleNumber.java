package algorithms._0136_single_number;

/**
 * ** Created by peter.guan on 2021/07/06.
 *
 * @author peter.guan
 */
public class SingleNumber {

    public int singleNumber(int[] nums) {
        int a = 0;
        for (int num : nums) {
            a ^= num;
        }
        return a;
    }
}
