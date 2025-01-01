class Solution {
    public int maxScore(String s) {
        int ones = 0;
        int zeros = 0;
        int n = s.length();

        for (char c : s.toCharArray()){
            if (c == '1') ones++;
        }

        int maxi = 0;
        for (int i = 0; i < n - 1; i++){
            if (s.charAt(i) == '0'){
                zeros++;
            }
            else {
                ones--;
            }
            maxi = Math.max(maxi, zeros + ones);
        }
        return maxi;
    }
}