class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++){
            int left = 0;
            for (int j = 0; j < i; j++){
                left += nums[j];
            }
            int right = 0;
            for (int j = i + 1; j < n; j++){
                right += nums[j];
            }
            if (left == right){
                return i;
            }
        }
        return -1;
    }
}