class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();

        List<Integer> al = new ArrayList<>();

        findComb(n, k, 1, al, res);

        return res;
    }
    public void findComb(int n, int k, int ind, List<Integer> al, List<List<Integer>> res) {
        if (al.size() == k) {
            res.add(new ArrayList<>(al));
            return;
        }
        if (al.size() > k || ind > n) {
            return;
        }

        for (int i = ind; i <= n; i++) {
            al.add(i);
            findComb(n, k, i + 1, al, res);
            al.remove(al.size() - 1);
        }
    }
}