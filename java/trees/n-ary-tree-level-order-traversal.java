/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    List<List<Integer>> res = new ArrayList<>();

    private void bfs(Node root) {
        if (root == null) {
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()) {
            int level = queue.size();
            
            List<Integer> row = new ArrayList<>();

            for (int i = 0; i < level; i++) {
                var curr = queue.poll();
                row.add(curr.val);

                for (int j = 0; j < curr.children.size(); j++) {
                    queue.add(curr.children.get(j));
                }
            }

            res.add(row);
        }
    }

    public List<List<Integer>> levelOrder(Node root) {
        bfs(root);
        return res;
    }
}

// https://leetcode.com/problems/n-ary-tree-level-order-traversal/
