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
    int maxi = 0;
    public int diameterOfBinaryTree(TreeNode root) {

        traversal(root);
        return maxi;
    }
    public void traversal(TreeNode root){
        if (root == null) {
            return;
        }
        int left_hei = height(root.left);
        int right_hei = height(root.right);

        maxi = Math.max(maxi, left_hei + right_hei);
        System.out.println(maxi);

        traversal(root.left);
        traversal(root.right);
    }
    public int height(TreeNode root) {
        if (root == null) return 0;

        return Math.max(height(root.left), height(root.right)) + 1;
    }
}