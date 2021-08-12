package algorithms._1207_unique_number_of_occurrences;

import java.util.*;

/**
 * ** Created by peter.guan on 2021/08/12.
 *
 * @author peter.guan
 */
public class UniqueNumberOfOccurrences {

    public boolean uniqueOccurrences(int[] arr) {

        int[] index = new int[2001];
        for (int n : arr) {
            index[n + 1000]++;
        }

        boolean[] times = new boolean[1000];
        for (int idx : index) {
            if (idx != 0) {
                if (times[idx]) {
                    return false;
                }
                times[idx] = true;
            }
        }
        return true;
    }

    public boolean formal(int[] arr) {
        Arrays.sort(arr);
        int count = 0;
        int curr = arr[0];
        List<Integer> list = new ArrayList<>();
        for (int n : arr) {
            if (curr == n) {
                count++;
                continue;
            }
            list.add(count);
            curr = n;
            count = 1;
        }
        list.add(count);

        Set<Integer> set = new HashSet<>(list);
        return list.size() == set.size();
    }

}
