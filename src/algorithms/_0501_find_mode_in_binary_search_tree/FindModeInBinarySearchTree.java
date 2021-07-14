package algorithms._0501_find_mode_in_binary_search_tree;

import java.util.ArrayList;
import java.util.List;

/**
 * ** Created by peter.guan on 2021/07/14.
 *
 * @author peter.guan
 */
public class FindModeInBinarySearchTree {

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

    int curr = 0;
    int count = 0;
    int maxCount = 0;
    List<Integer> list = new ArrayList<>();

    public int[] findMode(TreeNode root) {
        sort(root);
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }

    public void sort(TreeNode node) {
        if (node == null) {
            return;
        }
        sort(node.left);
        update(node.val);
        sort(node.right);
    }

    public void update(int val) {
        if (val == curr) {
            count++;
        } else {
            curr = val;
            count = 1;
        }

        if (count == maxCount) {
            list.add(val);
        }
        if (count > maxCount) {
            maxCount = count;
            list.clear();
            list.add(val);
        }
    }

}
