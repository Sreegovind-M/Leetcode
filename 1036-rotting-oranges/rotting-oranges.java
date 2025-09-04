class Solution {
    public int orangesRotting(int[][] grid) {
        int count = 2;

        boolean[][] visited = new boolean[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 2) {
                    dfs(grid, visited, i, j, 2);
                }
            }
        }

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) return -1;
                count = Math.max(count, grid[i][j]);
            }
        }
        return count - 2;
    }
    public void dfs(int grid[][], boolean visited[][], int i, int j, int minute) {
        if (i == grid.length || j == grid[0].length || i < 0 || j < 0) {
            return;
        }
        if (grid[i][j] == 0 || (1 < grid[i][j] && grid[i][j] < minute)) return;

        grid[i][j] = minute;
        visited[i][j] = true;

        dfs(grid, visited, i - 1, j, minute + 1);
        dfs(grid, visited, i + 1, j, minute + 1);
        dfs(grid, visited, i, j - 1, minute + 1);
        dfs(grid, visited, i, j + 1, minute + 1);
    }
}