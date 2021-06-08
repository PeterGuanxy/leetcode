package algorithms._0986_interval_list_intersections;

import java.util.*;

/**
 * ** Created by peter.guan on 2021/06/08.
 *
 * @author peter.guan
 */
public class IntervalListIntersections {

    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {

        int[][] res = new int[0][0];

        if (firstList.length == 0 || secondList.length == 0) {
            return res;
        }

        List<int[]> result = new ArrayList<>();
        int i = 0;
        int j = 0;

        //run till we reach the length of any of the arrays
        while(i < firstList.length && j < secondList.length){

            //getting the possible start and end points based on the runner i && j
            int[] start = firstList[i];
            int[] end = secondList[j];

            //getting the possible start interval, must be max of the start points
            int startInterval = Math.max(start[0], end[0]);
            //getting the possible end interval, must be min of the end points
            int endInterval = Math.min(start[1], end[1]);

            //checking if the possible start and end intervals valid
            //both of the start and end intervals must be between the limits
            if(startInterval <= end[1] && startInterval <= start[1] && endInterval >= start[0] && endInterval >= end[0]){
                result.add(new int[]{startInterval, endInterval});
            }

            //increasing the runners
            if(start[1] > end[1]) {
                j++;
            } else {
                i++;
            }
        }

        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {
        IntervalListIntersections interval = new IntervalListIntersections();
        int[][] a = interval.intervalIntersection(new int[][]{{0, 2}, {5, 10}, {13, 23}, {24, 25}},
                new int[][]{{1, 5}, {8, 12}, {15, 24}, {25, 26}});
        System.out.println(a);
    }


}
