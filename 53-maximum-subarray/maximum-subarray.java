class Solution {
    public int maxSubArray(int[] nums) {
        int maxi = Integer.MIN_VALUE;
        int n = nums.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            if (sum < 0) {
                sum = 0;
            }
            sum += nums[i];
            maxi = Math.max(maxi, sum);
        }
        return maxi;
    }
}