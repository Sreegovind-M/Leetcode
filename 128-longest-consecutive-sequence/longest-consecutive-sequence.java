class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        if (n == 0) return 0;
        if (n == 1) return 1;

        int maxi = 1;
        int cons = 1;
        for (int i = 1; i < n; i++){
            if (nums[i] == nums[i - 1]) continue;
            if (nums[i] - nums[i - 1] == 1){
                cons++;
            }
            else {
                cons = 1;
            }
            maxi = Math.max(cons, maxi);
        }
        return maxi;
    }
}