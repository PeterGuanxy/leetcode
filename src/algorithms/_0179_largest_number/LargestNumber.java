package algorithms._0179_largest_number;

import java.util.Arrays;
import java.util.Comparator;

/**
 * ** Created by peter.guan on 2021/07/15.
 *
 * @author peter.guan
 */
public class LargestNumber {

    public String largestNumber(int[] nums) {

        int n = nums.length;
        String[] strs = new String[n];

        for (int i = 0; i < n; i++) {
            strs[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(strs, new com());

        StringBuilder builder = new StringBuilder();
        int i = n - 1;
        while (i > 0 && strs[i].equals("0")) {
            i--;
        }
        while (i >= 0) {
            builder.append(strs[i]);
            i--;
        }
        return builder.toString();

    }

    class com implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            return (o1 + o2).compareTo(o2 + o1);
        }
    }
}
