class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp = new int[text1.length() + 1][text2.length() + 1];
        for (int i[] : dp) {
            Arrays.fill(i, -1);
        }
        return find(text1, text2, 0, 0, dp);
    }
    public int find(String s1, String s2, int i, int j, int dp[][]) {
        if (i == s1.length() || j == s2.length()) {
            return 0;
        }
        if (dp[i][j] != -1) return dp[i][j];
        int f = 0;
        int s = 0;
        if (s1.charAt(i) == s2.charAt(j)) {
            return 1 + find(s1, s2, i + 1, j + 1, dp);
        }
        else {
            f = 0 + find(s1, s2, i + 1, j, dp);
            s = 0 + find(s1, s2, i, j + 1, dp);
        }
        return dp[i][j] = Math.max(f, s);
    }
}