class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int i = 0;
        int j = n - 1;

        if (n == 1 && nums[0] != val) return i + 1;
        if (n == 1 && nums[0] == val) return i;

        while (i <= j){
            if (nums[i] == val){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j--; 
            }
            else {
                i++;
            }
        }
        return i;
    }
}