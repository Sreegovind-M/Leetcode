class Solution {
    
    static int minInsertions(String s) {
        // code here
        int dp[][] = new int[s.length() + 1][s.length() + 1];
        
        for (int i[] : dp) {
            Arrays.fill(i, -1);
        }
        int res = find(s, 0, s.length() - 1, dp);
        
        return res;
        
    }
    static int find(String s, int i, int j, int dp[][]) {
        if (i > j) {
            return 0;
        }
        if (dp[i][j] != -1) return dp[i][j];
        
        if (s.charAt(i) == s.charAt(j)) {
            return find(s, i + 1, j - 1, dp);
        }
        
        int left = find(s, i + 1, j, dp);
        int right = find(s, i, j - 1, dp);
        
        return dp[i][j] = 1 + Math.min(left, right);
        
    }
}