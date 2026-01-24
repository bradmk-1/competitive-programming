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
    List<String> res = new ArrayList<>();

    private void dfs(TreeNode root, String path) {
        if (root == null) {
            return;
        }

        String newPath = path + "->" + String.valueOf(root.val);

        dfs(root.left, newPath);
        dfs(root.right, newPath);

        if (root.left == null && root.right == null) {
            res.add(newPath);
        }
        
    }
    public List<String> binaryTreePaths(TreeNode root) {
        if (root.left == null && root.right == null) {
            res.add(String.valueOf(root.val));
        } else {
            dfs(root.left, String.valueOf(root.val));
            dfs(root.right, String.valueOf(root.val));            
        }
        return res;
    }
}

// https://leetcode.com/problems/binary-tree-paths
