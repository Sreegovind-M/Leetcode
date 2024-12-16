class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;

        if (n == 0) return 0;

        Set<Integer> set = new HashSet<>();
        for (int i : nums){
            set.add(i);
        }

        int maxi = 1;
        for (int i : set){
            if (!set.contains(i - 1)){
                int count = 1;
                int x = i;
                while (set.contains(x + 1)){
                    x++;
                    count++;
                }
                maxi = Math.max(maxi, count);
            }
        }
        return maxi;
    }
}