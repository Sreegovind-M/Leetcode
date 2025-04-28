class Solution {
    public void sortColors(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        int it = 0;
        while (it <= j) {
            if (nums[it] == 2) {
                int temp = nums[j];
                nums[j] = nums[it];
                nums[it] = temp;
                j--;
            }
            else if (nums[it] == 0) {
                int temp = nums[i];
                nums[i] = nums[it];
                nums[it] = temp;
                i++;
                it++;
            }
            else {
                it++;
            }
        }
    }
}