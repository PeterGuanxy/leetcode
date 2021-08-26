package algorithms._0204_count_primes;

/**
 * ** Created by peter.guan on 2021/08/24.
 *
 * @author peter.guan
 */
public class CountPrimes {

    public int countPrimes(int n) {

        if (n < 3) {
            return 0;
        }

        boolean[] primes = new boolean[n];
        int count = 1;
        for (int i = 3; i < n; i += 2) {
            if (!primes[i]) {
                count++;
            }
            for (int p = i * 3; p < n; p += i * 2) {
                primes[p] = true;
            }
        }
        return count;
    }

}
