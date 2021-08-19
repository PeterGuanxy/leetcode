package algorithms._1629_slowest_key;

/**
 * ** Created by peter.guan on 2021/08/19.
 *
 * @author peter.guan
 */
public class SlowestKey {

    public char slowestKey(int[] releaseTimes, String keysPressed) {

        int length = releaseTimes[0];
        char curr = keysPressed.charAt(0);

        for (int i = 1; i < releaseTimes.length; i++) {
            if (releaseTimes[i] - releaseTimes[i-1] > length) {
                length = releaseTimes[i] - releaseTimes[i-1];
                curr = keysPressed.charAt(i);
            } else if (releaseTimes[i] - releaseTimes[i-1] == length) {
                curr = keysPressed.charAt(i) - curr > 0 ? keysPressed.charAt(i) : curr;
            }
        }

        return curr;

    }

}
