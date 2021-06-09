package algorithms._0495_teemo_attacking;

/**
 * ** Created by peter.guan on 2021/06/08.
 *
 * @author peter.guan
 */
public class TeemoAttacking {

    public int findPoisonedDuration(int[] timeSeries, int duration) {

        if (timeSeries.length == 1) {
            return duration;
        }

        int result = 0;
        for (int i = 0; i < timeSeries.length - 1; i++) {
            if (timeSeries[i + 1] - timeSeries[i] >= duration) {
                result += duration;
            } else {
                result += (timeSeries[i + 1] - timeSeries[i]);
            }
        }

        result += duration;

        return result;

    }
}
