class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int mat[][] = new int[m][n];

        for (int i = 0; i < indices.length; i++){
            add(indices[i], mat);
        }
        int count = 0;
        for (int i = 0; i < m; i++){
            System.out.println(Arrays.toString(mat[i]));
            for (int j = 0; j < n; j++){
                if (mat[i][j] % 2 != 0){
                    count++;
                }
            }
        }
        return count;
    }
    public void add(int arr[], int mat[][]){
        int x = arr[0];
        int y = arr[1];

        for (int i = 0; i < mat.length; i++){
            mat[i][y]++;
        }
        for (int i = 0; i < mat[0].length; i++){
            mat[x][i]++;
        }
    }
    
}