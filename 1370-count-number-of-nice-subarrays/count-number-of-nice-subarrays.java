class Solution {
    public int numberOfSubarrays(int[] nums, int k) {

        return find(nums, k) - find(nums, k - 1);
    }
    public int find(int nums[], int k) {
        int res = 0;
        int l = 0;
        int r = 0;
        int n = nums.length;

        int count = 0;
        while (r < n) {
            count += nums[r] % 2;

            while (l <= r && count > k) {
                count -= nums[l] % 2;
                l++;
            }
            res += (r - l + 1);
            r++;
        }
        return res;

    }
}