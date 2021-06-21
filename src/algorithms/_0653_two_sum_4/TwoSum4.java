package algorithms._0653_two_sum_4;

import java.util.HashMap;
import java.util.Map;

/**
 * ** Created by peter.guan on 2021/06/21.
 *
 * @author peter.guan
 */
public class TwoSum4 {

    public static class TreeNode {
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

    public boolean findTarget(TreeNode root, int k) {
        if (root == null) {
            return false;
        }
        Map<Integer, Boolean> map = new HashMap<>();
        return deal(root, false, map, k);

        // faster
//        return solve(root, root, k);
    }


    public boolean deal(TreeNode node, boolean check, Map<Integer, Boolean> b, int k) {
        if (node == null) {
            return check;
        }

        if (b.getOrDefault(node.val, false)) {
            check = true;
        } else {
            b.put(k - node.val, true);
        }

        return deal(node.left, check, b, k) || deal(node.right, check, b, k);
    }


    /**
     * faster method
     */
    public static boolean find(TreeNode root, int val) {
        if (root == null) {
            return false;
        }

        if (val < root.val) {
            return find(root.left, val);
        } else if (val > root.val) {
            return find(root.right, val);
        } else {
            return true;
        }
    }

    public static boolean solve(TreeNode node, TreeNode root, int k) {
        if (node == null) {
            return false;
        }
        if (find(root, k - node.val) && (node.val != k - node.val)) {
            return true;
        }
        boolean ans = solve(node.left, root, k) || solve(node.right, root, k);
        return ans;
    }

    public static void main(String[] args) {
        TwoSum4 twoSum4 = new TwoSum4();
        TreeNode node2 = new TreeNode(2, null, null);
        TreeNode node3 = new TreeNode(3, null, null);
        TreeNode root = new TreeNode(1, node2, node3);
        twoSum4.findTarget(root, 1);
    }
}
