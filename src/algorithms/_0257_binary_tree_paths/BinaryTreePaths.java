package algorithms._0257_binary_tree_paths;

import java.util.ArrayList;
import java.util.List;

/**
 * ** Created by peter.guan on 2021/07/06.
 *
 * @author peter.guan
 */
public class BinaryTreePaths {

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

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        dfs(root, new StringBuilder(), res);
        return res;
    }

    public void dfs(TreeNode node, StringBuilder builder, List<String> res) {
        builder.append(node.val);
        if (node.left == null && node.right == null) {
            res.add(builder.toString());
            return;
        }
        builder.append("->");
        if (node.left != null) {
            dfs(node.left, new StringBuilder(builder), res);
        }
        if (node.right != null) {
            dfs(node.right, new StringBuilder(builder), res);
        }
    }

}
