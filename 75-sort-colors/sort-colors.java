class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int ind_0 = 0;
        int ind_2 = n - 1;

        int i = 0;
        while (i <= ind_2){
            if (nums[i] == 2){
                swap(i, ind_2, nums);
                ind_2--;
                
            }
            else if (nums[i] == 0){
                swap(i, ind_0, nums);
                ind_0++;
                i++;
            }
            else {
                i++;
            }
        }
    }
    public void swap(int x, int y, int nums[]){
        int temp = nums[y];
        nums[y] = nums[x];
        nums[x] = temp;
    }
}