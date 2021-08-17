package algorithms._0119_pascals_triangle_2;

import java.util.ArrayList;
import java.util.List;

/**
 * ** Created by peter.guan on 2021/08/17.
 *
 * @author peter.guan
 */
public class PascalsTriangle2 {

    public List<Integer> getRow(int rowIndex) {

        List<Integer> last = new ArrayList<>();

        for (int n = 1; n <= rowIndex + 1; n++) {
            List<Integer> curr = new ArrayList<>();
            if (n == 1) {
                curr.add(1);
                last = curr;
                continue;
            }

            if (n == 2) {
                curr.add(1);
                curr.add(1);
                last = curr;
                continue;
            }

            curr.add(1);
            for (int i = 0; i < n - 2; i++) {
                curr.add(last.get(i) + last.get(i + 1));
            }
            curr.add(1);
            last = curr;
        }
        return last;

    }

    public List<Integer> faster(int rowIndex) {
        List<Integer> ans = new ArrayList();
        ans.add(1);
        if (rowIndex == 0) {
            return ans;
        }
        List<Integer> pre = getRow(rowIndex - 1);
        for (int i = 1; i < rowIndex; i++) {
            ans.add(pre.get(i - 1) + pre.get(i));
        }
        ans.add(1);
        return ans;
    }

}
