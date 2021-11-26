package algorithms._0404_sum_of_left_leaves;

/**
 * ** Created by peter.guan on 2021/11/26.
 *
 * @author peter.guan
 */
public class SumOfLeftLeaves {

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

    int sum = 0;

    public int sumOfLeftLeaves(TreeNode root) {

        cul(root, false);
        return sum;
    }

    private void cul(TreeNode node, boolean isLeft) {
        if (node == null) {
            return;
        }
        if (node.left == null && node.right == null && isLeft) {
            sum += node.val;
        }
        cul(node.left, true);
        cul(node.right, false);
    }


}