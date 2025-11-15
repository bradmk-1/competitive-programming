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
        List<Integer> firstRoot = new ArrayList<>();
        List<Integer> secondRoot = new ArrayList<>();

        private void dfs(TreeNode root, List<Integer> leafTracker) {
            if (root == null) {
                return;
            };

            dfs(root.left, leafTracker);
            dfs(root.right, leafTracker);

            if (root.left == null && root.right == null) {
                leafTracker.add(root.val);
            }
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        dfs(root1, firstRoot);
        dfs(root2, secondRoot);

        return (firstRoot.equals(secondRoot));
    }
}

// https://leetcode.com/problems/leaf-similar-trees
