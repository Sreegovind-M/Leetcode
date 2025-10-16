class Solution {
    public void moveZeroes(int[] nums) {
        int non_zero = 0;
        int zero = 1;
        int n = nums.length;
        while (zero < n) {
            if (nums[non_zero] != 0) {
                non_zero++;
                zero++;
            }
            else if (nums[zero] == 0) {
                zero++;
            }
            else {
                nums[non_zero] = nums[zero];
                nums[zero] = 0;
            }
        }
    }
}