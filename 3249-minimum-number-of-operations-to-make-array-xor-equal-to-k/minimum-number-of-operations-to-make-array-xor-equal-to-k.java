class Solution {
    public int minOperations(int[] nums, int k) {
        int fin = 0;
        for (int i : nums){
            fin = fin ^ i;
        }
        int count = 0;
        while (fin > 0 || k > 0){
            if ((fin % 2) != (k % 2)){
                count++;
            }
            k = k / 2;
            fin = fin / 2;
        }
        return count;
    }
}