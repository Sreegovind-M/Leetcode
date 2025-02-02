class Solution {
    public int maxFrequency(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int l = 0, r = 0;
        long res = 0, tot = 0;

        while (r < n){
            tot += nums[r];
            while (nums[r] * (r - l + 1L) > tot + k){
                tot -= nums[l];
                l++;
            }
            res = Math.max(res, r - l + 1L);
            r++;
        }
        return (int)res;
    }
}