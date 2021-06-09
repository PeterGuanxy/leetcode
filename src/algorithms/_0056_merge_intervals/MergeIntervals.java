package algorithms._0056_merge_intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ** Created by peter.guan on 2021/06/08.
 *
 * @author peter.guan
 */
public class MergeIntervals {

    public int[][] merge(int[][] intervals) {


        if (intervals.length == 1) {
            return intervals;
        }

        Arrays.sort(intervals, (o1, o2) -> {
            int start1 = o1[0];
            int end1 = o1[1];
            int start2 = o2[0];
            int end2 = o2[1];

            if (start1 > start2) {
                return 1;
            } else if (start1 < start2) {
                return -1;
            } else {
                if (end1 < end2) {
                    return -1;
                } else if (end1 > end2) {
                    return 1;
                }
                return 0;
            }
        });
        int[] curr = intervals[0];
        List<int[]> list = new ArrayList<>();
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= curr[1]) {
                curr[1] = Math.max(intervals[i][1], curr[1]);
            } else {
                list.add(new int[]{curr[0], curr[1]});
                curr[0] = intervals[i][0];
                curr[1] = intervals[i][1];
            }

            if (i == intervals.length - 1) {
                list.add(new int[]{curr[0], curr[1]});
            }
        }

        return list.toArray(new int[list.size()][]);

    }

    public static void main(String[] args) {
        MergeIntervals mergeIntervals = new MergeIntervals();
        int[][] arrays = new int[][]{{1, 3}, {0, 2}, {8, 10}, {15, 18}};
        int[][] arr = mergeIntervals.merge(arrays);
        for (int[] a : arr) {
            for (int b : a) {
                System.out.println(b);
            }
        }
    }


}
