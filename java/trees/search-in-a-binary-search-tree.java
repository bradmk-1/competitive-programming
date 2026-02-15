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
    private TreeNode dfs(TreeNode root, int val) {
        if (root == null) {
            return root;
        }

        if (root.val > val) {
            return dfs(root.left, val);
        } else if (root.val < val) {
            return dfs(root.right, val);
        } else {
            return root;
        }
    }
    public TreeNode searchBST(TreeNode root, int val) {
        return dfs(root, val);
    }
}

// https://leetcode.com/problems/search-in-a-binary-search-tree
