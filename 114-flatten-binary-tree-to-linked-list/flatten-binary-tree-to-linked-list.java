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
    TreeNode temp = new TreeNode(-1);
    TreeNode ite = temp;
    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }
        preOrder(root);
        root.left = null;
        if (temp.right.right != null) {
            root.right = temp.right.right;
        }
        // root.right = temp;
    }
    public void preOrder(TreeNode root) {
        if (root == null) return;

        ite.right = new TreeNode(root.val);
        ite = ite.right;
        preOrder(root.left);
        preOrder(root.right);
    }
}