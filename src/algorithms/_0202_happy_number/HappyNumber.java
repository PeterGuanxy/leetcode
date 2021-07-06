package algorithms._0202_happy_number;

/**
 * ** Created by peter.guan on 2021/07/06.
 *
 * @author peter.guan
 */
public class HappyNumber {

    public boolean isHappy(int n) {
        int fast = getNext(n);
        int slow = n;

        while (fast != 1 && slow != fast) {
            slow = getNext(slow);
            fast = getNext(getNext(fast));
        }
        return fast == 1;
    }

    public int getNext(int n) {
        int sum = 0;
        while (n > 0) {
            int next = n % 10;
            n /= 10;
            sum += next * next;
        }
        return sum;
    }
}
