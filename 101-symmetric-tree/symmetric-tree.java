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
    public boolean isSymmetric(TreeNode root) {
        return traversal(root);
    }
    public boolean traversal(TreeNode root){
        Stack<TreeNode> st = new Stack<>();
        st.push(root.left);
        st.push(root.right);

        while (!st.isEmpty()){
            TreeNode node1 = st.pop();
            TreeNode node2 = st.pop();

            if (node1 == null && node2 == null) continue;
            if (node1 == null || node2 == null || node1.val != node2.val) return false;

            st.push(node1.left);
            st.push(node2.right);
            st.push(node1.right);
            st.push(node2.left);
        }
        return true;
    }
}