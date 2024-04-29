class Solution {
    public int minOperations(int[] nums, int k) {
        int res = 0;
        for (int i : nums){
            res = res ^ i;
        }
        res = res ^ k;
        int ans = 0;
        while (res > 0){
            if ((res & 1) != 0){
                ans++;
            }
            res = res >> 1;
        }
        return ans;
    }
}