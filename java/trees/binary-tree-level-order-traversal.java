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
    List<List<Integer>> res = new ArrayList<>();

    public void bfs(TreeNode root) {
        if (root == null) {
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()) {
            int level = queue.size();

            List<Integer> row = new ArrayList<>();
            for(int i = 0; i < level; i++) {
                var curr = queue.poll();
                row.add(curr.val);

                if (curr.left != null) {
                    queue.add(curr.left);
                }
                if (curr.right != null) {
                queue.add(curr.right);
                }
            }
            res.add(row);
        }

    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        bfs(root);
        return res;
    }
}


// https://leetcode.com/problems/binary-tree-level-order-traversal/
