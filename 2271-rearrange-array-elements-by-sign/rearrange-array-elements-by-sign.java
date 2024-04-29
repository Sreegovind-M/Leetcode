class Solution {
    public int[] rearrangeArray(int[] nums) {
        int res[] = new int[nums.length];
        int e_ind = 0, o_ind = 1;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] > 0){
                res[e_ind] = nums[i];
                e_ind += 2;
            }
            else {
                res[o_ind] = nums[i];
                o_ind += 2;
            }
        }
        return res;
    }
}