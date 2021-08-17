package algorithms._0118_pascals_triangle;

import java.util.ArrayList;
import java.util.List;

/**
 * ** Created by peter.guan on 2021/08/17.
 *
 * @author peter.guan
 */
public class PascalsTriangle {

    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> res = new ArrayList<>();
        List<Integer> last = new ArrayList<>();

        for (int n = 1; n <= numRows; n++) {
            List<Integer> curr = new ArrayList<>();
            if (n == 1) {
                curr.add(1);
                res.add(curr);
                last = curr;
                continue;
            }

            if (n == 2) {
                curr.add(1);
                curr.add(1);
                res.add(curr);
                last = curr;
                continue;
            }

            curr.add(1);
            for (int i = 0; i < n - 2; i++) {
                curr.add(last.get(i) + last.get(i+1));
            }
            curr.add(1);
            res.add(curr);
            last = curr;
        }
        return res;
    }

}
