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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();

        if (root == null){
            return res;
        }

        traversal(root, res);
        return res;
    }
    public void traversal(TreeNode root, List<List<Integer>> res){
        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);

        ArrayList<Integer> al = new ArrayList<>();

        al.add(root.val);
        while (!q.isEmpty()){
            al = new ArrayList<>();
            int n = q.size();
            for (int i = 0; i < n; i++){
                TreeNode curr = q.poll();
                al.add(curr.val);

                if (curr.left != null){
                    q.add(curr.left);
                }
                if (curr.right != null){
                    q.add(curr.right);
                }
            }
            res.add(al);
        }
    }
}