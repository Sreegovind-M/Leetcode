class Solution {
    public long minimumSteps(String s) {
        int n = s.length();
        long res = 0;

        int j = n - 1;
        int k = n;
        int ones_count = 0;
        while (j >= 0){
            if (s.charAt(j) == '1'){
                ones_count++;
                res += k -j;
                k--;
            }
            j--;
        }
        return res - ones_count;
    }
}