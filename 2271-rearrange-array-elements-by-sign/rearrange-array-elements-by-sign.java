class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int pos[] = new int[n / 2];
        int x = 0;
        int neg[] = new int[n / 2];
        int y = 0;
        
        for (int i : nums){
            if (i > 0){
                pos[x++] = i;
            }
            else {
                neg[y++] = i;
            }
        }

        int res[] = new int[n];
        x = 0;
        y = 0;
        for (int i = 0; i < n; i += 2){
            res[i] = pos[x++];
            res[i + 1] = neg[y++];
        }

        return res;
    }
}