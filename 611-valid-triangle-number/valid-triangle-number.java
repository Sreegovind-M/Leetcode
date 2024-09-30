class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        int n = nums.length;
        for (int i = n - 1; i >= 1; i--){
            int low = 0;
            int high = i - 1;
            while (low < high){
                if (nums[low] + nums[high] > nums[i]){
                    count += high - low;
                    high--;
                }
                else {
                    low++;
                }
            }
        }
        return count;
    }
}