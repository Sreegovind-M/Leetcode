class Solution {
    public int[] twoSum(int[] nums, int target) {
        int res[] = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                int b = nums[j];
                if (a + b == target) {
                    res[0] = i;
                    res[1] = j;
                }
            }
        }
        return res;
    }
}