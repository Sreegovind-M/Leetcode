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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();

        if (root == null){
            return res;
        }

        levelOrder(root, res);

        return res;
    }
    public void levelOrder(TreeNode root, List<List<Integer>> res){
        ArrayList<Integer> al = new ArrayList<>();

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int level = 0;
        while (!q.isEmpty()){
            int n = q.size();
            al = new ArrayList<Integer>();
            for (int i = 0; i < n; i++){
                TreeNode curr = q.poll();
                al.add(curr.val);

                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
            }
            level++;
            if (level % 2 == 0){
                Collections.reverse(al);
                res.add(al);
            }else res.add(al);
        }
    }
}