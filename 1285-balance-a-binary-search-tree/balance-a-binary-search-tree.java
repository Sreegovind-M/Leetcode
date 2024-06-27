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
    private List<TreeNode> sortArr = new ArrayList<>();
    public TreeNode balanceBST(TreeNode root) {
        inOrder(root);
        return sortArray(0, sortArr.size() - 1);
    }
    private void inOrder(TreeNode root){
        if (root == null){
            return;
        }
        inOrder(root.left);
        sortArr.add(root);
        inOrder(root.right);
    }
    private TreeNode sortArray(int s, int e){
        if (s > e) return null;
        int mid = (s + e) / 2;
        TreeNode root = sortArr.get(mid);
        root.left = sortArray(s, mid - 1);
        root.right = sortArray(mid + 1, e);
        return root;
    }
}