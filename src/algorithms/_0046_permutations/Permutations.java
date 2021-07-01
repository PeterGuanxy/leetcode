package algorithms._0046_permutations;

import java.util.ArrayList;
import java.util.List;

/**
 * ** Created by peter.guan on 2021/07/01.
 *
 * @author peter.guan
 */
public class Permutations {

    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();
        if (nums.length == 0) {
            return res;
        }

        List<Integer> path = new ArrayList<>();
        dfs(nums, res, path);
        return res;

    }

    public void dfs(int[] nums, List<List<Integer>> res, List<Integer> path) {
        if (path.size() == nums.length) {
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (path.contains(nums[i])) {
                continue;
            }
            path.add(nums[i]);
            dfs(nums, res, path);
            path.remove(path.size() - 1);
        }

    }

    public static void main(String[] args) {
        Permutations permutations = new Permutations();
        permutations.permute(new int[]{1,2,3});
    }
}
