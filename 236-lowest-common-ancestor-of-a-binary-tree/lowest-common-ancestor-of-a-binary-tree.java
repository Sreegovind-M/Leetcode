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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return root;
        }
        TreeNode lefts = lowestCommonAncestor(root.left, p, q);
        TreeNode rights = lowestCommonAncestor(root.right, p, q);
        if (lefts != null && rights != null) {
            return root;
        }
        if (root == p || root == q) return root;
        return lefts != null ? lefts : rights;
    }
}