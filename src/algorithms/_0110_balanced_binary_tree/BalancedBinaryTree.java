package algorithms._0110_balanced_binary_tree;

/**
 * ** Created by peter.guan on 2021/07/05.
 *
 * @author peter.guan
 */
public class BalancedBinaryTree {

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

    public boolean isBalanced(TreeNode root) {
        return height(root) != -1;
    }

    private int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left_length = height(root.left);
        if (left_length == -1) {
            return -1;
        }

        int right_length = height(root.right);
        if (right_length == -1) {
            return -1;
        }

        if (Math.abs(right_length - left_length) > 1) {
            return -1;
        }

        return 1 + Math.max(left_length, right_length);
    }
}
