class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int i : nums) sum += i;
        if (sum % 2 != 0) return false;
        
        sum /= 2;
        int dp[][] = new int[nums.length + 1][sum + 1]; 

        for (int i = 0; i <= nums.length; i++) {
            Arrays.fill(dp[i], -1);
        }
        return find(nums, sum, nums.length - 1, dp);
    }
    public boolean find(int nums[], int sum, int n, int dp[][]) {
        if (sum == 0) {
            return true;
        }
        if (n < 0 || sum < 0) {
            return false;
        }
        if (dp[n][sum] != -1) {
            return dp[n][sum] == 1 ? true : false;
        }
        dp[n][sum] = (find(nums, sum - nums[n], n - 1, dp) || find(nums, sum, n - 1, dp)) == true ? 1 : 0;

        return dp[n][sum] == 1 ? true : false;
    }
}