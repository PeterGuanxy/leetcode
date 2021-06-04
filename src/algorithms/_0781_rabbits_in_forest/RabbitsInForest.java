package algorithms._0781_rabbits_in_forest;

import java.util.*;

/**
 * ** Created by peter.guan on 2021/06/04.
 *
 * @author peter.guan
 */
public class RabbitsInForest {

    public int numRabbits(int[] answers) {
        if (answers.length == 0) {
            return 0;
        }

        Arrays.sort(answers);

        int toBeSkipped = answers[0];
        int result = answers[0] + 1;
        for (int i = 1; i < answers.length; i++) {
            if (answers[i] == answers[i - 1] && toBeSkipped > 0) {
                toBeSkipped--;
            } else {
                toBeSkipped = answers[i];
                result += answers[i] + 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        RabbitsInForest rabbit = new RabbitsInForest();
        System.out.println(rabbit.numRabbits(new int[]{0, 0, 1, 1, 1}));
    }

}
