class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int prefix[] = new int[n];
        prefix[0] = nums[0];
        for (int i = 1; i < n; i++){
            prefix[i] = prefix[i - 1] + nums[i];
        }

        int count = 0;
        for (int i = 0; i < n; i++){
            for (int j = i + 1; j < n; j++){
                int sum = prefix[j] - prefix[i];
                if (k == sum) count++;
            }
            if (prefix[i] == k) count++;
        }
        return count;
    }
}