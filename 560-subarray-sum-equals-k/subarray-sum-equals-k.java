class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int prefix[] = new int[n];
        int count = 0;
        
        prefix[0] = nums[0];

        for (int i = 1; i < n; i++){
            prefix[i] = nums[i] + prefix[i - 1];
        }

        for (int i = 0; i < n; i++){
            for (int j = i + 1; j < n; j++){
                int x = prefix[j] - prefix[i];

                if (x == k){
                    count++;
                }
            }
            if (prefix[i] == k){
                count++;
            }
        }

        return count;
    }
}