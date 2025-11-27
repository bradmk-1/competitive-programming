/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {

    TreeNode res;

    private void dfs(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return;
        }

        if (p.val < root.val && q.val < root.val) {
            dfs(root.left, p, q);
        } else if (p.val > root.val && q.val > root.val) {
            dfs(root.right, p, q);
        } else {
            res = root;
        }
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        dfs(root, p, q);
        return res;
    }
}


// https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
