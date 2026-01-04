/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private boolean dfs(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }

        var newTarget = targetSum - root.val;

        if (newTarget == 0 && root.left == null && root.right == null) return true;

        return dfs(root.left, newTarget) || dfs(root.right, newTarget);
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        return dfs(root, targetSum);
    }
}

// https://leetcode.com/problems/path-sum/
