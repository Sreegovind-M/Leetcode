class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        fun(nums, res, new ArrayList<>(), 0);
        return res;
    }
    public void fun(int nums[], List<List<Integer>> res, ArrayList<Integer> al, int ind){
        res.add(new ArrayList<>(al));

        for (int i = ind; i < nums.length; i++){
            al.add(nums[i]);
            fun(nums, res, al, i + 1);
            al.remove(al.size() - 1);
        }
    }
}