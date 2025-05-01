class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();

        List<Integer> al = new ArrayList<>();
        find(candidates, target, 0, al, res);

        return res;
    }
    public void find(int arr[], int tar, int i, List<Integer> al, List<List<Integer>> res) {
        if (tar == 0) {
            res.add(new ArrayList<>(al));
            al = new ArrayList<>();
            return;
        }
        if (i == arr.length) return;

        if (arr[i] <= tar) {
            al.add(arr[i]);
            find(arr, tar - arr[i], i, al, res);
            al.remove(al.size() - 1);
        }
        find(arr, tar, i + 1, al, res);
    }
}