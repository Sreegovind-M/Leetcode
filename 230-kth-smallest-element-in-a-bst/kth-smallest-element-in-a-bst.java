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
    public int kthSmallest(TreeNode root, int k) {
        if (root == null) {
            return -1;
        }
        int count[] = {0};
        int val[] = {0};
        findSmall(root, k, count, val);
        return val[0];
    }
    public void findSmall(TreeNode root, int k, int count[], int val[]) {
        if (root == null) {
            return;
        }
        findSmall(root.left, k, count, val);
        count[0]++;
        if (count[0] == k) {
            val[0] = root.val;
        }
        findSmall(root.right, k, count, val);
    }
}