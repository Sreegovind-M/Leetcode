class Solution {
    public int singleNumber(int[] nums) {
        int sin = 0;
        for (int i : nums){
            sin ^= i;
        }
        return sin;
    }
}