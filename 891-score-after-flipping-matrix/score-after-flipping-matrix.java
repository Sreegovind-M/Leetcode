class Solution {
    public int matrixScore(int[][] grid) {
        int n = grid.length; 
        int m = grid[0].length;

        int ans = n * (int)(Math.pow(2, m - 1 - 0));

        for (int j = 1; j < m; j++){
            int col_count = 0;
            for (int i = 0; i < n; i++){
                col_count += grid[i][0] == 1 ? grid[i][j] : (grid[i][j] ^ 1);
            }

            if (col_count < (n - col_count)){
                ans += (n - col_count) * Math.pow(2, m - 1 - j);
            }
            else {
                ans += col_count * Math.pow(2, m - 1 - j);
            }
        }
        return ans;
    }
}