class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;

        int res[] = new int[n];
        Arrays.fill(res, 1);

        int maxi = 1;
        for (int i = 1; i < n; i++){
            for (int j = 0; j < i; j++){
                if (nums[i] > nums[j]){
                    int temp = Math.max(1 + res[j], res[i]);

                    res[i] = temp;
                }
            }
            maxi = Math.max(res[i], maxi);
        }

        return maxi;

    }
}