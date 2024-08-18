class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxi = Integer.MIN_VALUE;
        double sum = 0;
        int start = 0;
        for (int e = 0; e < nums.length; e++){
            sum = sum + nums[e];
            if (e - start + 1 == k){
                maxi = Math.max(maxi, sum / k);
                sum = sum - nums[start];
                start++;
            }
        }
        return maxi;
    }
}