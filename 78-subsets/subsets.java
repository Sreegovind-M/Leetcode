class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        int tot = 1 << n;
        for (int i = 0; i < tot; i++) {
            List<Integer> al = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    al.add(nums[j]);
                }
            }
            res.add(al);
        }
        return res;
    }
}