class Solution {
    public boolean canJump(int[] nums) {
        int maxiJump = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++){
            if (i > maxiJump){
                return false;
            }
            maxiJump = Math.max(maxiJump, i + nums[i]);
            if (maxiJump >= n - 1){
                return true;
            }
        }
        return false;
    }
}