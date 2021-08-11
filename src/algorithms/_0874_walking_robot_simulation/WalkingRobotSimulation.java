package algorithms._0874_walking_robot_simulation;

import java.util.*;

/**
 * ** Created by peter.guan on 2021/08/11.
 *
 * @author peter.guan
 */
public class WalkingRobotSimulation {

    public int robotSim(int[] commands, int[][] obstacles) {

        int[][] dir = {{0, 1},
                {-1, 0},
                {0, -1},
                {1, 0}};
        int i = 0, j = 0, di = 0, eDist = 0;
        Set<String> obs = new HashSet<>();

        for (int[] ob : obstacles) {
            int a = ob[0];
            int b = ob[1];
            obs.add(a + " " + b);
        }

        int ind = 0;

        while (ind < commands.length) {
            int act = commands[ind];
            ind++;
            if (act == -2) {
                di = (di + 1) % 4;
            } else if (act == -1) {
                di = (di + 3) % 4;
            } else {
                while (act > 0) {
                    int ti = i + dir[di][0];
                    int tj = j + dir[di][1];
                    if (!obs.contains(ti + " " + tj)) {
                        i += dir[di][0];
                        j += dir[di][1];
                    }
                    act--;
                }
            }

            eDist = Math.max(eDist, i * i + j * j);
        }
        return eDist;
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(n % 4);
        System.out.println(1 % 4);
        System.out.println(2 % 4);
        System.out.println(6 % 4);
    }

}
