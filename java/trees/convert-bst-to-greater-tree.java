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
    int sum = 0;

    private TreeNode dfs(TreeNode root) {
        if (root == null) {
            return root;
        }
        
        dfs(root.right);
        root.val += sum;
        sum = root.val;
        dfs(root.left);


        return root;
    }
    public TreeNode convertBST(TreeNode root) {
        return dfs(root);
    }
}

// https://leetcode.com/problems/convert-bst-to-greater-tree/
