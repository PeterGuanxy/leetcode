package algorithms._0077_combinations;

import java.util.ArrayList;
import java.util.List;

/**
 * ** Created by peter.guan on 2021/08/16.
 *
 * @author peter.guan
 */
public class Combinations {

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList();
        List<Integer> temp = new ArrayList();
        backTrack(n, k, 1, ans, temp);
        return ans;
    }
    private void backTrack(int n, int k, int dep, List<List<Integer>> ans, List<Integer> temp) {
        if (temp.size() == k) {
            ans.add(new ArrayList(temp));
            return;
        }
        for (int i = dep; i <= n - k + 1 + temp.size(); i++) {
            temp.add(i);
            backTrack(n, k, i + 1, ans, temp);
            temp.remove(temp.size() - 1);
        }
    }

}
