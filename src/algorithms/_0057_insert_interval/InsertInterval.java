package algorithms._0057_insert_interval;

import java.util.ArrayList;
import java.util.List;

/**
 * ** Created by peter.guan on 2021/07/12.
 *
 * @author peter.guan
 */
public class InsertInterval {

    public int[][] insert(int[][] intervals, int[] newInterval) {
        if (intervals == null || intervals.length == 0) {
            return new int[][]{newInterval};
        }

        if (newInterval == null) {
            return intervals;
        }
        List<int[]> list = new ArrayList<>();
        int x = 0;
        while (x < intervals.length && intervals[x][1] < newInterval[0]) {
            list.add(intervals[x]);
            x++;
        }

        while (x < intervals.length && intervals[x][0] <= newInterval[1]) {
            newInterval[0] = Math.min(intervals[x][0], newInterval[0]);
            newInterval[1] = Math.max(intervals[x][1], newInterval[1]);
            x++;
        }
        list.add(newInterval);
        while (x < intervals.length) {
            list.add(intervals[x]);
            x++;
        }
        return list.toArray(new int[list.size()][]);

    }
}
