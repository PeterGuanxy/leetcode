package algorithms._0539_minimum_time_difference;

import java.util.Collections;
import java.util.List;

/**
 * ** Created by peter.guan on 2021/08/12.
 *
 * @author peter.guan
 */
public class MinimumTimeDifference {

    public int findMinDifference(List<String> timePoints) {

        Collections.sort(timePoints);
        int min = Integer.MAX_VALUE;
        String curr = timePoints.get(0);
        for (int i = 1; i < timePoints.size(); i++) {
            String now = timePoints.get(i);
            if (now.equals(curr)) {
                return 0;
            }
            int currhour = Integer.valueOf(curr.split(":")[0]);
            int nowhour = Integer.valueOf(now.split(":")[0]);
            int currmin = Integer.valueOf(curr.split(":")[1]);
            int nowmin = Integer.valueOf(now.split(":")[1]);

            if (nowmin < currmin) {
                nowhour--;
                nowmin += 60;
            }

            int mini = (nowhour - currhour) * 60 + nowmin - currmin;
            mini = Math.min(mini, 1440 - mini);
            min = Math.min(min, mini);
            curr = now;
        }

        curr = timePoints.get(0);
        String now = timePoints.get(timePoints.size() - 1);
        int currhour = Integer.valueOf(curr.split(":")[0]);
        int nowhour = Integer.valueOf(now.split(":")[0]);
        int currmin = Integer.valueOf(curr.split(":")[1]);
        int nowmin = Integer.valueOf(now.split(":")[1]);

        if (nowmin < currmin) {
            nowhour--;
            nowmin += 60;
        }

        int mini = (nowhour - currhour) * 60 + nowmin - currmin;
        mini = Math.min(mini, 1440 - mini);
        min = Math.min(min, mini);

        return min;
    }

    public int fast(List<String> timePoints) {
        boolean[] times = new boolean[60 * 24];
        for (String cur : timePoints) {
            int time = Integer.valueOf(cur.substring(0, 2)) * 60 + Integer.valueOf(cur.substring(3));
            if (times[time]) {
                return 0;
            }
            times[time] = true;
        }

        int first = -1;
        int last = -1;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < times.length; i++) {
            if (times[i]) {
                if (last != -1) {
                    min = Math.min(min, i - last);
                }
                last = i;
                if (first == -1) {
                    first = i;
                }
            }
        }

        return Math.min(min, times.length - last + first);
    }

    public static void main(String[] args) {
        int a = Integer.valueOf("01");
        System.out.println(a);

    }

}
