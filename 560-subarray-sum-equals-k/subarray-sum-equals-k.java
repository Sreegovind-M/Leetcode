class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        
        int count = 0;
        int sum = 0;
        
        map.put(0, 1);
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            count += map.getOrDefault(sum - k, 0);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        System.out.println(map);
        return count;
    }
}