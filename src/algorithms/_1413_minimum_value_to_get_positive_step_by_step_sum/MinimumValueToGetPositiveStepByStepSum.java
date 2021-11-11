package algorithms._1413_minimum_value_to_get_positive_step_by_step_sum;

/**
 * ** Created by peter.guan on 2021/11/11.
 *
 * @author peter.guan
 */
public class MinimumValueToGetPositiveStepByStepSum {

    public int minStartValue(int[] nums) {

        int min = 0;
        int sum = 0;
        for (int i : nums) {
            sum += i;
            min = Math.min(min, sum);
        }

        return 1 - min;
    }
}
