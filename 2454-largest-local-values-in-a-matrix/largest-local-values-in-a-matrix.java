class Solution {
    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int res[][] = new int[n - 2][m - 2];

        int count = 0;

        List<Integer> al = new ArrayList<>();

        int i_ind = 0;

        for (int i = 0; i < n - 2; i++){
            for (int j = 0; j < m - 2; j++){
                int maxi = 0;

                for (int r = i; r < i + 3; r++){
                    for (int c = j; c < j + 3; c++){
                        maxi = Math.max(grid[r][c], maxi);
                    }
                }
                res[i][j] = maxi;
            }
        }
        
        return res;
    }
}