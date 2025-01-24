class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        List<Integer> rows = new ArrayList<>();
        List<Integer> cols = new ArrayList<>();

        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                if (matrix[i][j] == 0){
                    rows.add(i);
                    cols.add(j);
                }
            }
        }

        for (int i = 0; i < rows.size(); i++){
            change(rows.get(i), true, matrix);
        }
        for (int i = 0; i < cols.size(); i++){
            change(cols.get(i), false, matrix);
        }

        // System.out.println(rows);
        // System.out.println(cols);
        // for (int i = 0; i < n; i++){
        //     System.out.println(Arrays.toString(matrix[i]));
        // }
        
    }
    public void change(int x, boolean col_it, int matrix[][]){
        if (col_it == true){
            for (int i = 0; i < matrix[x].length; i++){
                matrix[x][i] = 0;
            }
        }
        else {
            for (int i = 0; i < matrix.length; i++){
                matrix[i][x] = 0;
            }
        }
    }
}