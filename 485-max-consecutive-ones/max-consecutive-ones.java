class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxi = 0;
        int count = 0;
        for (int i : nums){
            if (i == 1){
                count++;
            }
            else {
                maxi = Math.max(count, maxi);
                count = 0;
            }
        }
        return Math.max(count, maxi);
    }
}