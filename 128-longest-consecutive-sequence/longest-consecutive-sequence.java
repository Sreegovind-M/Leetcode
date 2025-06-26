class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        Arrays.sort(nums);

        int maxi = 1;
        for (int i = 0; i < n; i++) {
            if (map.containsKey(nums[i] - 1)) {
                map.put(nums[i], map.get(nums[i] - 1) + 1);
                maxi = Math.max(map.get(nums[i]), maxi);
            }
            else {
                map.put(nums[i], 1);
            }
        }
        return maxi;
    }
}