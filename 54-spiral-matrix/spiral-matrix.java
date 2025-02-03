class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> al = new ArrayList<>();

        int row = matrix.length - 1;
        int row_st = 0;
        int col = matrix[0].length - 1;
        int col_st = 0;

        while (row_st <= row && col_st <= col){
            // Right Move
            for (int i = col_st; i <= col; i++){
                al.add(matrix[row_st][i]);
            }
            row_st++;
            // Down Move
            for (int i = row_st; i <= row; i++){
                al.add(matrix[i][col]);
            }
            col--;
            // Left Move
            if (row_st <= row){
                for (int i = col; i >= col_st; i--){
                    al.add(matrix[row][i]);
                }
            }
            row--;
            // Up Move
            if (col_st <= col){
                for (int i = row; i >= row_st; i--){
                    al.add(matrix[i][col_st]);
                }
            }
            col_st++;
        } 
        return al;
    }  
}