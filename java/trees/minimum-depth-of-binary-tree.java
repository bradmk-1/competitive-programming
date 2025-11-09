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
    private int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = dfs(root.left);
        int rightHeight = dfs(root.right);


        // Pathfind, since there could be a case where left tree is empty,
        // but there is still a valid path to the right
        if (leftHeight == 0 || rightHeight == 0) {
            return 1 + Math.max(leftHeight, rightHeight);
        }
        return Math.min(leftHeight, rightHeight) + 1;
    }
    public int minDepth(TreeNode root) {
       return dfs(root);
    }
}

// https://leetcode.com/problems/minimum-depth-of-binary-tree/description/

