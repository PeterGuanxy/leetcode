package algorithms._0649_dota2_senate;

import java.util.LinkedList;
import java.util.Queue;

/**
 * ** Created by peter.guan on 2021/06/08.
 *
 * @author peter.guan
 */
public class Dota2Senate {

    public String predictPartyVictory(String senate) {

        if (!senate.contains("R")) {
            return "Dire";
        }
        if (!senate.contains("D")) {
            return "Radiant";
        }

        int n = senate.length();
        Queue<Integer> radiant = new LinkedList<>();
        Queue<Integer> dire = new LinkedList<>();

        for (int i = 0; i < senate.length(); i++) {
            if (senate.charAt(i) == 'R') {
                radiant.offer(i);
            } else {
                dire.offer(i);
            }
        }

        // 贪心算法
        while (!radiant.isEmpty() && !dire.isEmpty()) {
            int r = radiant.poll();
            int d = dire.poll();
            if (r < d) {
                radiant.offer(r + n);
            } else {
                dire.offer(d + n);
            }
        }

        return !radiant.isEmpty() ? "Radiant" : "Dire";
    }

    public static void main(String[] args) {

    }

}
