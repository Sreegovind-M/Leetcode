class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length - 1;
        
        if (nums.length == 1){
            return true;
        }

        for (int i = n - 1; i >= 0; i--){
            if (i + nums[i] >= n){
                n = i;
                if (n == 0){
                    return true;
                }
            }
        }
        return false;
    }
}