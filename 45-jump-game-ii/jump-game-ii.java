class Solution {
    public int jump(int[] nums) {
        int n = nums.length;

        if (n == 1){
            return 0;
        }

        int farthestDist = 0;
        int maxiIndexReachedSoFar = 0;
        int jumps = 0;

        for (int i = 0; i < n; i++){
            farthestDist = Math.max(nums[i] + i, farthestDist);
            if (i == maxiIndexReachedSoFar){
                jumps++;
                maxiIndexReachedSoFar = farthestDist;
            }
            if (maxiIndexReachedSoFar >= n - 1){
                return jumps;
            }
        }
        return jumps;
    }
}