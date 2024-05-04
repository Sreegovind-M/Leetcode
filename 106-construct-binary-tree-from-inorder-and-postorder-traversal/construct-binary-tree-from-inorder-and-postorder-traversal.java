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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder.length != postorder.length || inorder == null || postorder == null){
            return null;
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < inorder.length; i++){
            map.put(inorder[i], i);
        }

        return operationTree(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1, map);
    }

    public TreeNode operationTree(int in[], int in_s, int in_e, int po[], int po_s, int po_e, HashMap<Integer, Integer> map){
        if (in_s > in_e || po_s > po_e){
            return null;
        }

        TreeNode root = new TreeNode(po[po_e]);
        int ind_root = map.get(po[po_e]);
        int nums_left = ind_root - in_s;

        root.left = operationTree(in, in_s, ind_root - 1, po, po_s, po_s + nums_left - 1, map);

        root.right = operationTree(in, ind_root + 1, in_e, po, po_s + nums_left, po_e - 1, map);

        return root;

    }
}