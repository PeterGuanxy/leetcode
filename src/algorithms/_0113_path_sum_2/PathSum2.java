package algorithms._0113_path_sum_2;

import java.util.ArrayList;
import java.util.List;

/**
 * ** Created by peter.guan on 2021/07/06.
 *
 * @author peter.guan
 */
public class PathSum2 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {

        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        dfs(root, targetSum, 0, new ArrayList<>(), res);
        return res;
    }

    public void dfs(TreeNode node, int targetSum, int sum, List<Integer> path, List<List<Integer>> res) {
        if (node == null) {
            return;
        }
        sum += node.val;
        path.add(node.val);
        if (node.left == null && node.right == null) {
            if (sum == targetSum) {
                res.add(new ArrayList<>(path));
            }
            sum -= node.val;
            path.remove(path.size() - 1);
            return;
        }
        dfs(node.left, targetSum, sum, path, res);
        dfs(node.right, targetSum, sum, path, res);
        sum -= node.val;
        path.remove(path.size() - 1);
    }

}
