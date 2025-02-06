class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> al = new ArrayList<>();

        fun(candidates, 0, target, res, al);

        return res;
    }
    public void fun(int arr[], int ind, int tar, List<List<Integer>> res, List<Integer> al){
        if (ind == arr.length) {
            if (tar == 0){
                res.add(new ArrayList<>(al));
            }
            return;
        }

        if (arr[ind] <= tar) {
            al.add(arr[ind]);
            fun(arr, ind, tar - arr[ind], res, al);
            al.remove(al.size() - 1);

        }
        fun(arr, ind + 1, tar, res, al);
    }

}