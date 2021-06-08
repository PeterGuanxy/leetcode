package algorithms._0977_squares_of_a_sorted_array;

/**
 * ** Created by peter.guan on 2021/06/08.
 *
 * @author peter.guan
 */
public class SquaresOfASortedArray {

    public int[] sortedSquares(int[] nums) {

        int max = Math.abs(nums[0]);
        int min = Math.abs(nums[0]);

        for (int i = 0; i < nums.length; i++) {
            nums[i] = Math.abs(nums[i]);
            if (max < nums[i]) {
                max = nums[i];
            }

            if (min > nums[i]) {
                min = nums[i];
            }
        }

        int[] bucket = new int[max - min + 1];
        for (int n : nums) {
            bucket[n - min]++;
        }

        for (int i = 1; i < bucket.length; i++) {
            bucket[i] = bucket[i] + bucket[i - 1];
        }

        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[--bucket[nums[i] - min]] = nums[i] * nums[i];
        }

        return result;
    }

    // 已经是排序了的失误了
    public int[] sortedSquares2(int[] nums) {
        //by two pointer approach
        //result array
        int[] res = new int[nums.length];
        //pointers for left and right
        int lo = 0;
        int hi = nums.length - 1;
        //iterate from n to 0
        for (int i = nums.length - 1; i >= 0; i--) {
            //check if abs left is less than or equal to abs right
            if (Math.abs(nums[lo]) >= Math.abs(nums[hi])) {
                //add left squared to result array
                res[i] = nums[lo] * nums[lo];
                //increment left pointer
                lo++;
            } else {
                //add right squared to result array
                res[i] = nums[hi] * nums[hi];
                //decrement right pointer
                hi--;
            }
        }
        //result
        return res;
    }

    public static void main(String[] args) {
        SquaresOfASortedArray square = new SquaresOfASortedArray();
        square.sortedSquares(new int[]{-7, -3, 2, 3, 11});
    }
}
