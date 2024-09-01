class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int mat[][] = new int[m][n];
        
        if (original.length > m * n || m * n > original.length){
            return new int[][] {};
        }

        int ind = 0;
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                if (ind < original.length){
                    mat[i][j] = original[ind++];
                }
            }
        }
        return mat;
    }
}