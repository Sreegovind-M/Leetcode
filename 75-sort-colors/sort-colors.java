class Solution {
    public void sortColors(int[] nums) {
        int zero_ind = 0;
        int i = 0;
        int two_ind = nums.length - 1;

        while (i <= two_ind) {
            if (nums[i] == 2) {
                int temp = nums[two_ind];
                nums[two_ind] = nums[i];
                nums[i] = temp;
                two_ind--;
            }
            else if (nums[i] == 0) {
                int temp = nums[zero_ind];
                nums[zero_ind] = nums[i];
                nums[i] = temp;
                zero_ind++;
                i++;
            }
            else {
                i++;
            }
        }

    }
}