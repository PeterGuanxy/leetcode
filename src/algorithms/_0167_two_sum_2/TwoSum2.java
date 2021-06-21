package algorithms._0167_two_sum_2;

import java.util.HashMap;
import java.util.Map;

/**
 * ** Created by peter.guan on 2021/06/21.
 *
 * @author peter.guan
 */
public class TwoSum2 {

    public int[] twoSum(int[] numbers, int target) {

        if (numbers.length == 2) {
            return new int[]{1, 2};
        }
        int left = 0;
        int right = numbers.length - 1;
        while (right > left) {
            if (numbers[left] + numbers[right] == target) {
                return new int[]{left + 1, right + 1};
            } else if (numbers[left] + numbers[right] > target) {
                right--;
            } else {
                left++;
            }
        }
        return null;
    }

    public int[] twoSum2(int[] numbers, int target) {

        Map<Integer, Integer> map = new HashMap<>(numbers.length);
        for (int i = 0; i < numbers.length; i++) {
            int check = map.getOrDefault(numbers[i], -1);
            if (check == -1) {
                map.put(target - numbers[i], i);
            } else {
                return new int[]{check + 1, i + 1};
            }

        }
        return null;
    }

}
