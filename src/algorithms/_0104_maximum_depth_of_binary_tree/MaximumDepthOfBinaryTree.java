package algorithms._0104_maximum_depth_of_binary_tree;

/**
 * ** Created by peter.guan on 2021/07/05.
 *
 * @author peter.guan
 */
public class MaximumDepthOfBinaryTree {

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

    public int maxDepth(TreeNode root) {
        return dfs(root, 0);
    }

    public int dfs(TreeNode node, int depth) {

        if (node == null) {
            return depth;
        }
        depth++;
        return Math.max(dfs(node.left, depth), dfs(node.right, depth));
    }
}
