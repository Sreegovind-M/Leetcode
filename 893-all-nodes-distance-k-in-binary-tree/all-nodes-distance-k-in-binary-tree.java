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
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        HashMap<TreeNode, TreeNode> parent = new HashMap<>();

        makeParent(root, parent);

        HashMap<TreeNode, Boolean> visited = new HashMap<>();
        Queue<TreeNode> que = new LinkedList<>();


        que.offer(target);
        visited.put(target, true);
        int level = 0;

        while (!que.isEmpty()) {
            int n = que.size();

            if (level == k) {
                break;
            }
            for (int i = 0; i < n; i++) {
                TreeNode curr = que.poll();

                if (curr.left != null && visited.get(curr.left) == null) {
                    que.offer(curr.left);
                    visited.put(curr.left, true);
                }
                if (curr.right != null && visited.get(curr.right) == null) {
                    que.offer(curr.right);
                    visited.put(curr.right, true);
                }
                if (parent.get(curr) != null && visited.get(parent.get(curr)) == null) {
                    que.offer(parent.get(curr));
                    visited.put(parent.get(curr), true);
                }
            }
            level++;
        }
        List<Integer> res = new ArrayList<>();

        while (!que.isEmpty()) {
            res.add(que.poll().val);
        }
        return res;
    }
    public void makeParent(TreeNode root, HashMap<TreeNode, TreeNode> parent) {
        Queue<TreeNode> que = new LinkedList<>();

        if (root == null) {
            return;
        }
        que.offer(root);

        while (!que.isEmpty()) {
            TreeNode curr = que.poll();
            if (curr.left != null) {
                parent.put(curr.left, curr);
                que.offer(curr.left);
            }
            if (curr.right != null) {
                parent.put(curr.right, curr);
                que.offer(curr.right);
            }
        }
    }
}