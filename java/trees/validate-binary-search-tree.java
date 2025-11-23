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
    List<Integer> treeNodes = new ArrayList<>();

    private void dfs(TreeNode root) {
        if (root == null) {
            return;
        }

        dfs(root.left);
        treeNodes.add(root.val);
        dfs(root.right);
    }

    public boolean isValidBST(TreeNode root) {
        dfs(root);
        for (int i = 0; i < treeNodes.size() - 1; i++) {
            if (treeNodes.get(i) >= treeNodes.get(i + 1)) {
                return false;
            }
        }
        return true;
    }
}

// https://leetcode.com/problems/validate-binary-search-tree/
