class Solution {
    public boolean stoneGame(int[] piles) {
        int n = piles.length;

        int alice = 0;
        int bob = 0;

        Boolean dp[][][] = new Boolean[n][n][2];

        boolean res = find(piles, alice, bob, 0, n - 1, true, dp);
        return res;
    }
    public boolean find(int piles[], int alice, int bob, int x, int y, boolean flag, Boolean dp[][][]) {
        if (x > y) {
            return alice > bob;
        }
        int turn = flag == true ? 1 : 0;
        if (dp[x][y][turn] != null) {
            return dp[x][y][turn];
        }
        boolean a_first = false;
        boolean a_last = false;
        boolean b_first = false;
        boolean b_last = false;


        if (flag == true) {
            a_first = find(piles, alice + piles[x], bob, x + 1, y, !flag, dp);
            a_last = find(piles, alice + piles[y], bob, x, y - 1, !flag, dp);
        }
        else {
            b_first = find(piles, alice, bob + piles[x], x + 1, y, !flag, dp); 
            b_last = find(piles, alice, bob + piles[y], x, y - 1, !flag, dp);
        }


        dp[x][y][turn] = a_first || a_last || b_first || b_last;

        return dp[x][y][turn];
    } 
}