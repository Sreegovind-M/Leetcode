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
    public int maxPathSum(TreeNode root) {
        int maxi[] = new int[1];

        maxi[0] = Integer.MIN_VALUE;

        find(root, maxi);

        return maxi[0];
    }
    public int find(TreeNode root, int[] maxi) {
        if (root == null) {
            return 0;
        }
        int l = 0;
        int r = 0;
        l = Math.max(l, find(root.left, maxi));
        r = Math.max(r, find(root.right, maxi));

        maxi[0] = Math.max(l + r + root.val, maxi[0]);
        System.out.println(l + " " + r);

        return root.val + Math.max(l, r);
    }
}