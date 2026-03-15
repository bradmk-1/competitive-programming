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
    public boolean isCompleteTree(TreeNode root) {
        if (root == null) {
            return true;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        
        boolean hasEmpty = false;
        
        while (!queue.isEmpty()) {
            int level = queue.size();

            for (int i = 0; i < level; i++) {
                var curr = queue.poll();

                if (hasEmpty && curr != null) {
                    return false;
                }

                if (curr == null) {
                    hasEmpty = true;
                } else {
                    queue.add(curr.left);
                    queue.add(curr.right);

                }
            }
        }

        return true;
    }
}

// https://leetcode.com/problems/check-completeness-of-a-binary-tree
