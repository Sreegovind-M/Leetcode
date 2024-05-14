class Solution {
    public int matrixScore(int[][] grid) {
        int ans = 0;
        int n = grid.length;
        int m = grid[0].length;
        for (int i = 0; i < n; i++){
            if (grid[i][0] == 0){
                for (int j = 0; j < m; j++){
                    grid[i][j] ^= 1;
                }
            }
        }

        for (int j = 1; j < m; j++){
            int col_count = 0;
            for (int i = 0; i < n; i++){
                col_count += grid[i][j];
            }

            if (col_count < (n - col_count)){
                for (int i = 0; i < n; i++){
                    grid[i][j] ^= 1;
                }
            }
        }

        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                ans += grid[i][j] * Math.pow(2, m - 1 - j);
            }
                System.out.println(Arrays.toString(grid[i]));
                
        }
        return ans;
    }
}