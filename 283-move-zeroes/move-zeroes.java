class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        if (n < 2) return;
        int start = 0;
        int end = 1;
        while (end < n){
            if (nums[start] != 0){
                start++;
                end++;
            }
            else if(nums[end] == 0){
                end++;
            }
            else {
                int temp = nums[end];
                nums[end] = 0;
                nums[start] = temp;
            }
        }
    }
}