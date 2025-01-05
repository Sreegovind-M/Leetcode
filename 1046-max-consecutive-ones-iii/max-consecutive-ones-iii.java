class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;

        int l = 0;
        int r = 0;

        int no_zero = 0;
        int maxi = 0;

        while (r < n){
            // if (no_zero >= k){
            //     maxi = Math.max(maxi, r - l + 1);
            //     System.out.println(l + " " + r);
            //     if (nums[l] == 0){
            //         no_zero--;
            //     }
            //     l++;
            // }
            // else {
            //     if (nums[r] == 0){
            //         no_zero++;
            //     }
            //     r++;
            // }
            if (nums[r] == 0){
                no_zero++;
            }
            if (no_zero > k){
                if (nums[l] == 0){
                    no_zero--;
                }
                l++;
            }
            r++;
        }
        return r - l;
    }
}