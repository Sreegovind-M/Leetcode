class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < n; i++){
            if (i > 0 && nums[i] == nums[i - 1]){
                continue;
            }
            int j = i + 1;
            int k = n - 1;
            while (j < k){
                int adder = nums[i] + nums[j] + nums[k];
                if (adder > 0){
                    k--;
                }
                else if (adder < 0){
                    j++;
                }
                else {
                    List<Integer> al = new ArrayList<>();
                    al.add(nums[i]);
                    al.add(nums[j]);
                    al.add(nums[k]);
                    res.add(al);
                    j++;
                    while (nums[j] == nums[j - 1] && j < k){
                        j++;
                    }
                }
            }
        }
        return res;
    }
}