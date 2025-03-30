class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return check(nums, goal) - check(nums, goal - 1);
    }
    public int check(int arr[], int tar) {
        if (tar < 0) return 0;
        int l = 0;
        int r = 0;
        int count = 0;
        int sum = 0;
        while (r < arr.length) {
            sum += arr[r];
            while (sum > tar) {
                sum -= arr[l];
                l++;
            }
            count += r - l + 1;
            r++;
        }
        return count;
    }
}