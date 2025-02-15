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
    TreeMap<Integer, ArrayList<int[]>> map = new TreeMap<>();
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        inorder(root, 0, 0);
        
        for (ArrayList<int[]> li : map.values()) {
            Collections.sort(li, (a, b) -> a[0] == b[0] ? Integer.compare(a[1], b[1]) : Integer.compare(a[0], b[0]));
            ArrayList<Integer> cu = new ArrayList<>();
            for (int arr[] : li) {
                cu.add(arr[1]);
            }
            res.add(cu);
        }
        

        return res;
    }
    public void inorder(TreeNode root, int row, int col) {
        if (root == null) {
            return;
        }
        map.putIfAbsent(col, new ArrayList<>());
        map.get(col).add(new int[]{row, root.val});
        inorder(root.left, row + 1, col - 1);
        inorder(root.right, row + 1, col + 1);
    }
}