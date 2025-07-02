class Solution {
    public int minDistance(String word1, String word2) {
        int dp[][] = new int[word1.length() + 1][word2.length() + 1];

        for (int i[] : dp) {
            Arrays.fill(i, -1);
        }

        int res = find(word1, word2, 0, 0, dp);


        return res;
    }
    public int find(String s1, String s2, int i, int j, int dp[][]) {
        if (i == s1.length()) {
            return s2.length() - j;
        }
        if (j == s2.length()) {
            return s1.length() - i;
        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        int del = 0;
        int ins = 0;
        int rep = 0;
        if (s1.charAt(i) == s2.charAt(j)) {
            return find(s1, s2, i + 1, j + 1, dp);
        }
        else {
            del = find(s1, s2, i + 1, j, dp);
            ins = find(s1, s2, i, j + 1, dp);
            rep = find(s1, s2, i + 1, j + 1, dp);
            return dp[i][j] = 1 + Math.min(ins, Math.min(del, rep));
        }
    }
}