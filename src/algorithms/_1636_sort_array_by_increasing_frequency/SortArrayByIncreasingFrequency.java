package algorithms._1636_sort_array_by_increasing_frequency;

import java.util.*;

/**
 * ** Created by peter.guan on 2021/07/21.
 *
 * @author peter.guan
 */
public class SortArrayByIncreasingFrequency {

    public int[] frequencySort(int[] nums) {

        Arrays.sort(nums);
        int curr = nums[nums.length - 1];
        int count = 0;
        Map<Integer, int[]> map = new HashMap<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == curr) {
                count++;
                if (i != 0) {
                    continue;
                }
            }
            int[] now = new int[count];
            Arrays.fill(now, curr);
            int[] exist = map.get(count);
            int[] save;
            if (exist == null) {
                save = now;
            } else {
                save = Arrays.copyOf(exist, exist.length + now.length);
                System.arraycopy(now, 0, save, exist.length, now.length);
            }
            map.put(count, save);

            if (nums[i] != curr && i == 0) {
                int[] exist1 = map.get(1);
                if (exist1 == null) {
                    map.put(1, new int[]{nums[0]});
                } else {
                    int[] save1 = Arrays.copyOf(exist1, exist1.length + 1);
                    save1[save1.length - 1] = nums[0];
                    map.put(1, save1);
                }
            }
            curr = nums[i];
            count = 1;
        }

        List<Integer> keyset = new ArrayList<>(map.keySet());
        Collections.sort(keyset);
        int[] res = new int[nums.length];
        int i = 0;
        for (int key : keyset) {
            int[] a = map.get(key);
            for (int n : a) {
                res[i++] = n;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        SortArrayByIncreasingFrequency sort = new SortArrayByIncreasingFrequency();
        int[] res = sort.frequencySort(new int[]{1, 5, 0, 5});
        System.out.println(res);
    }
}
