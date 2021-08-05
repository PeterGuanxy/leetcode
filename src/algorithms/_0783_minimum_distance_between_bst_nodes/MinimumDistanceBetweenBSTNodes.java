package algorithms._0783_minimum_distance_between_bst_nodes;

/**
 * ** Created by peter.guan on 2021/08/05.
 *
 * @author peter.guan
 */
public class MinimumDistanceBetweenBSTNodes {

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

    int prev = Integer.MAX_VALUE, diff = Integer.MAX_VALUE;

    public int minDiffInBST(TreeNode root) {
        helper(root);
        return diff;
    }

    public void helper(TreeNode root) {
        if (root == null) {
            return;
        }
        helper(root.left);
        diff = Math.min(diff, Math.abs(root.val - prev));
        prev = root.val;
        helper(root.right);
    }


}
