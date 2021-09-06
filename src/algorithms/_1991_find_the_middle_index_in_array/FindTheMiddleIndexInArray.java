package algorithms._1991_find_the_middle_index_in_array;

/**
 * ** Created by peter.guan on 2021/09/06.
 *
 * @author peter.guan
 */
public class FindTheMiddleIndexInArray {

    public int findMiddleIndex(int[] nums) {
        int totalSum = 0;
        for (int n : nums) {
            totalSum += n;
        }

        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (leftSum == totalSum - nums[i]) {
                return i;
            } else {
                leftSum += nums[i];
                totalSum -= nums[i];
            }
        }
        return -1;
    }
}
