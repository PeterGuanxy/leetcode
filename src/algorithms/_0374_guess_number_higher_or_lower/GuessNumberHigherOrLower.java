package algorithms._0374_guess_number_higher_or_lower;

/**
 * ** Created by peter.guan on 2021/06/11.
 *
 * @author peter.guan
 */
public class GuessNumberHigherOrLower {

    int guess(int num) {
        return 1;
    }

    public int guessNumber(int n) {
        int left = 1;
        int right = n;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (guess(mid) == 0) {
                return mid;
            }
            if (guess(mid) == -1) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
