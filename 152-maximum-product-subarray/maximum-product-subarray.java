class Solution {
    public int maxProduct(int[] nums) {
        int res = nums[0];
        int prod = 1;
        int n = nums.length;
        for (int i = 0; i < n; i++){
            prod = prod * nums[i];
            res = Math.max(prod, res);

            if (nums[i] == 0){
                prod = 1;
            }
        }
        prod = 1;
        for (int i = n - 1; i >= 0; i--){
            prod = prod * nums[i];
            res = Math.max(res, prod);
            if (nums[i] == 0){
                prod = 1;
            }
        }
        return res;
    }
}