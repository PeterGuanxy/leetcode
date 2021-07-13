package algorithms._0145_binary_tree_postorder_traversal;

import java.util.ArrayList;
import java.util.List;

/**
 * ** Created by peter.guan on 2021/07/13.
 *
 * @author peter.guan
 */
public class BinaryTreePostorderTraversal {

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

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        sort(root, list);
        return list;

    }

    public void sort(TreeNode node, List<Integer> list) {
        if (node.left != null) {
            sort(node.left, list);
        }

        if (node.right != null) {
            sort(node.right, list);
        }

        list.add(node.val);
    }

}
