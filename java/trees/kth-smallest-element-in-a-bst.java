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
    List<Integer> nodeList = new ArrayList<>();

    private void dfs(TreeNode root) {
        if (root == null) {
            return;
        };

        dfs(root.left);
        nodeList.add(root.val);
        dfs(root.right);
    }

    public int kthSmallest(TreeNode root, int k) {
        if (root == null) {
            return 0;
        }

        dfs(root);

        return nodeList.get(k - 1);
    }
}

// https://leetcode.com/problems/kth-smallest-element-in-a-bst
