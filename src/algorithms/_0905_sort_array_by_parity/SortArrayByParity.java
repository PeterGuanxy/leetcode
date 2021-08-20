package algorithms._0905_sort_array_by_parity;

import java.util.ArrayList;
import java.util.List;

/**
 * ** Created by peter.guan on 2021/08/19.
 *
 * @author peter.guan
 */
public class SortArrayByParity {

    public int[] sortArrayByParity(int[] nums) {

        List<Integer> evenList = new ArrayList<>();
        List<Integer> oddList = new ArrayList<>();

        for (int n : nums) {
            if (n % 2 == 0) {
                evenList.add(n);
            } else {
                oddList.add(n);
            }
        }

        evenList.addAll(oddList);
        return evenList.stream().mapToInt(Integer::valueOf).toArray();
    }

    public int[] faster(int[] nums) {

        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            if (nums[i] % 2 == 0) {
                i++;
                continue;
            }
            if (nums[j] % 2 != 0) {
                j--;
                continue;
            }

            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
        return nums;
    }

}
