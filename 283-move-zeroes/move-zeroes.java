class Solution {
    public void moveZeroes(int[] nums) {
        int s = 0;
        int e = 1;

        while (e < nums.length) {
            if (nums[s] != 0) {
                s++;
                e++;
            }
            else if (nums[e] == 0) {
                e++;
            }
            else {
                nums[s] = nums[e];
                nums[e] = 0;
            }
        }
    }
}