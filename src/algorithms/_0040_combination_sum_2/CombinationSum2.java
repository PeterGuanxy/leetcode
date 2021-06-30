package algorithms._0040_combination_sum_2;

import java.util.*;

/**
 * ** Created by peter.guan on 2021/06/30.
 *
 * @author peter.guan
 */
public class CombinationSum2 {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        List<List<Integer>> res = new ArrayList<>();
        if (candidates.length == 0) {
            return res;
        }
        Arrays.sort(candidates);
        Deque<Integer> path = new ArrayDeque<>();
        dfs(candidates, target, 0, res, path);
        return res;
    }

    public void dfs(int[] candidates, int target, int begin, List<List<Integer>> res, Deque<Integer> path) {

        if (target == 0) {
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = begin; i < candidates.length; i++) {

            if (target - candidates[i] < 0) {
                break;
            }

            if (i > begin && candidates[i] == candidates[i - 1]) {
                continue;
            }

            path.addLast(candidates[i]);
            dfs(candidates, target - candidates[i], i + 1, res, path);
            path.removeLast();

        }

    }

    public static void main(String[] args) {
        double a = Double.valueOf("0.4");
        System.out.println(a);
    }
}
