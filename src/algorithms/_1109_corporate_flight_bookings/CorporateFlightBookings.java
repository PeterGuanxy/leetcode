package algorithms._1109_corporate_flight_bookings;

/**
 * ** Created by peter.guan on 2021/12/27.
 *
 * @author peter.guan
 */
public class CorporateFlightBookings {

    public int[] corpFlightBookings(int[][] bookings, int n) {

        int[] res = new int[n];
        for (int[] book : bookings) {
            for (int i = book[0] - 1; i <= book[1] - 1; i++) {
                res[i] += book[2];
            }
        }
        return res;
    }

    public int[] faster(int[][] bookings, int n) {
        int[] ans = new int[n];
        for (int[] booking : bookings) {
            int i = booking[0] - 1;
            int j = booking[1];
            int seats = booking[2];
            ans[i] += seats;
            if (j != n) {
                ans[j] -= seats;
            }
        }

        int count = 0;
        for (int i = 0; i < ans.length; i++) {
            ans[i] += count;
            count = ans[i];
        }
        return ans;
    }
}
