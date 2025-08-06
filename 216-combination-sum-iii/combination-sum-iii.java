class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> al = new ArrayList<>();
        find(res, al, k, n, 1);
        return res;
    }
    public void find(List<List<Integer>> res, List<Integer> al, int k, int tar, int num) {
        if (tar == 0 && k == 0) {
            res.add(new ArrayList<>(al));
            return;
        }
        for (int i = num; i < 10; i++) {
            if (i > tar || k <= 0) break;
            al.add(i);
            find(res, al, k - 1, tar - i, i + 1);
            al.remove(al.size() - 1);
        }
    }
}