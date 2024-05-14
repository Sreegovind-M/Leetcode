class Solution {
    int n = 0, m = 0, maxCollected = 0;
    int positions[][] = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    public int getMaximumGold(int[][] grid) {
        n = grid.length;
        m = grid[0].length;

        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                if (grid[i][j] != 0){
                    dfs(grid, i, j, 0);
                }
            }
        }
        return maxCollected;
    }
    public void dfs(int grid[][], int i, int j, int golds){
        if (i < 0 || i >= n || j < 0 || j >= m || grid[i][j] == 0){
            return;
        }

        int currGold = grid[i][j];
        grid[i][j] = 0;
        maxCollected = Math.max(currGold + golds, maxCollected);

        for (int arr[] : positions){
            dfs(grid, i + arr[0], j + arr[1], golds + currGold);
        }
        grid[i][j] = currGold;
    }
}