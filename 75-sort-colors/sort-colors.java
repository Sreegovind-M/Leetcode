class Solution {
    public void sortColors(int[] nums) {
        int zero_ind = 0;
        int two_ind = nums.length - 1;

        int i = 0;

        while (i <= two_ind){
            if (nums[i] == 0){
                swap(i, zero_ind, nums);
                zero_ind++;
                i++;
            }
            else if (nums[i] == 2){
                swap(i, two_ind, nums);
                two_ind--;
            }
            else {
                i++;
            }
        }

    }
    public void swap(int x, int y, int nums[]){
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
}