package algorithms._0437_path_sum_3;

import java.util.HashMap;

/**
 * ** Created by peter.guan on 2021/11/26.
 *
 * @author peter.guan
 */
public class PathSum3 {

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

//    int count = 0;
//
//    public int pathSum(TreeNode root, int targetSum) {
//        if (root == null) {
//            return count;
//        }
//
//        pathSum(root.left, targetSum);
//        pathSum(root.right, targetSum);
//
//        cul(root, targetSum, 0);
//
//        return count;
//
//    }
//
//    public void cul(TreeNode node, int targetSum, int sum) {
//        if (node == null) {
//            return;
//        }
//        sum += node.val;
//        if (sum == targetSum) {
//            count++;
//        }
//        cul(node.left, targetSum, sum);
//        cul(node.right, targetSum, sum);
//        return;
//    }

    HashMap<Integer, Integer> hm = new HashMap<>();

    int count = 0;

    public int pathSum(TreeNode root, int targetSum) {
        hm.put(0, 1);
        pathsum3(root, targetSum, 0);
        return count;
    }

    public void pathsum3(TreeNode root, int targetSum, int currSum) {
        if (root == null) {
            return;
        }
        currSum += root.val;

        if (hm.containsKey(currSum - targetSum)) {
            count += hm.get(currSum - targetSum);
        }

        if (hm.containsKey(currSum)) {
            hm.put(currSum, hm.get(currSum) + 1);
        } else {
            hm.put(currSum, 1);
        }
        pathsum3(root.left, targetSum, currSum);
        pathsum3(root.right, targetSum, currSum);
        hm.put(currSum, hm.get(currSum) - 1);
    }

}
