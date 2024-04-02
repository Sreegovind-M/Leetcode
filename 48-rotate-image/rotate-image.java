class Solution {
    public void rotate(int[][] matrix) {
        int temp[][] = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                temp[i][j] = matrix[j][i];
            }
        }

        for (int i = 0; i < matrix.length; i++){
            int y = matrix[0].length - 1;
            for (int j = 0; j < matrix[0].length; j++){
                matrix[i][j] = temp[i][y--];
            }
        }
    }
}