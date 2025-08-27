class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long maxi = 0;
        int negCount = 0;

        int n = matrix.length;
        int m = matrix[0].length;

        int mini = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] < 0) {
                    negCount++;
                }
                mini = Math.min(Math.abs(matrix[i][j]), mini);
                maxi += Math.abs(matrix[i][j]);
            }
        }
        if (negCount % 2 == 0) {
            return maxi;
        }
        return maxi - mini - mini;

    }
}