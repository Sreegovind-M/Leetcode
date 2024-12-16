class Solution {
    public int[] rearrangeArray(int[] nums) {
        int pos_ind = 0;
        int neg_ind = 1;
        int n = nums.length;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++){
            if (nums[i] > 0){
                arr[pos_ind] = nums[i];
                pos_ind += 2;
            }
            else {
                arr[neg_ind] = nums[i];
                neg_ind += 2;
            }
        }
        return arr;
    }
}