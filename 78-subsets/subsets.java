class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        List<Integer> al = new ArrayList<>();

        findSubsets(nums, 0, al, res);

        return res;
    }
    public void findSubsets(int nums[], int ind, List<Integer> al, List<List<Integer>> res) {
        if (ind == nums.length) {
            if (!res.contains(al)) {
                res.add(new ArrayList<>(al));
            }
            return;
        }
        // res.add(new ArrayList<>(al));
        for (int i = ind; i < nums.length; i++) {
            al.add(nums[i]);
            findSubsets(nums, i + 1, al, res);
            al.remove(al.size() - 1);
        }
        findSubsets(nums, ind + 1, al, res);
    }
}