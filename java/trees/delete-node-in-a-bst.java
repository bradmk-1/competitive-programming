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
    private TreeNode getRightMin(TreeNode root) {
        while (root.left != null) {
            root = root.left;
        }

        return root;
    }

    private TreeNode dfs(TreeNode root, int key) {
        if (root == null) {
            return root;
        }

        if (key < root.val) {
            root.left = dfs(root.left, key);
        } else if (key > root.val) {
            root.right = dfs(root.right, key);
        } else {
            if (root.left == null && root.right == null) {
                return null;
            }
            if (root.left == null && root.right != null) {
                return root.right;
            }
            if (root.left != null && root.right == null) {
                return root.left;
            }
            // to maintain bst, find inorder successor
            // then replace root with it, and then re-search to delete
            if (root.left != null && root.right != null) {
                var temp = root.right;
                var minRight = getRightMin(root.right);
                root.val = minRight.val;
                root.right = dfs(root.right, minRight.val);
            }   
        }
    
        return root;
    }

    public TreeNode deleteNode(TreeNode root, int key) {
        return dfs(root, key);
    }
}

// https://leetcode.com/problems/delete-node-in-a-bst
