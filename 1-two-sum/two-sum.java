class Solution {
    public int[] twoSum(int[] nums, int target) {
        int x = -1;
        int y = -1;
        
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        // map.put(0, 0);
        for (int i = 0; i < n; i++) {
            if (map.containsKey(target - nums[i])) {
                x = map.get(target - nums[i]);
                y = i;
            }
            else {
                map.put(nums[i], i);
            }
        }
        return new int[] {x, y};
    }
}