class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int right = 0;
        for (int i : nums){
            right += i;
        }
        int res[] = new int[n];
        int left = 0;
        for (int i = 0; i < n; i++){
            right -= nums[i];
            res[i] = Math.abs(right - left);
            left += nums[i];
        }
        return res;
    }
}