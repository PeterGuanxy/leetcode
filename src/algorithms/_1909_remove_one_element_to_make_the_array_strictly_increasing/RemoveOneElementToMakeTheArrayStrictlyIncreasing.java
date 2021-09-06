package algorithms._1909_remove_one_element_to_make_the_array_strictly_increasing;

/**
 * ** Created by peter.guan on 2021/09/02.
 *
 * @author peter.guan
 */
public class RemoveOneElementToMakeTheArrayStrictlyIncreasing {

    public boolean canBeIncreasing(int[] nums) {
        int count = 0;
        int t = 0;
        int n = nums.length;
        if (nums.length <= 2) {
            return true;
        }
        if (nums.length > 2) {

            for (int i = 0; i < n - 1; i++) {
                if (nums[i] == nums[i + 1]) {
                    t++;
                }
            }
            if (t == nums.length - 1) {
                return false;
            }
        }

        int index = -1;
        for (int i = 1; i < n; i++) {
            if (nums[i - 1] >= nums[i]) {
                count++;
                index = i;
            }
        }
        if (count > 1) {
            return false;
        }
        if (count == 0) {
            return true;
        }
        if (index == n - 1 || index == 1) {
            return true;
        }
        if (nums[index - 1] < nums[index + 1]) {
            return true;
        }
        if (nums[index - 2] < nums[index]) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        RemoveOneElementToMakeTheArrayStrictlyIncreasing test = new RemoveOneElementToMakeTheArrayStrictlyIncreasing();
        System.out.println(test.canBeIncreasing(new int[]{2, 3, 1, 4}));
    }
}
