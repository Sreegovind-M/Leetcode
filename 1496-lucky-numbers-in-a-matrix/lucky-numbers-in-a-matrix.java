class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        ArrayList<Integer> al = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++){
            int temp = matrix[i][0];
            int temp_ind = 0;
            for (int j = 0; j < matrix[i].length; j++){
                if (matrix[i][j] < temp){
                    temp = matrix[i][j];
                    temp_ind = j;
                }
            }
            boolean check = true;
            for (int k = 0; k < matrix.length; k++){
                if (temp < matrix[k][temp_ind]){
                    check = false;
                    break;
                }
            }
            if (check == true){
                al.add(temp);
            }
        }
        return al;
    }
}