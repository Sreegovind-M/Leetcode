class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        
        int res = nums[0];
        int sum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++){
            if (sum >= 0){
                sum += nums[i];
            }
            else {
                sum = nums[i];
            }
            res = Math.max(sum, res);
        }
        return res;
    }
}