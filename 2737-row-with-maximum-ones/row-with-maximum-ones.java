class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int arr[] = new int[2];

        int max_count = 0;

        for (int i = 0; i < mat.length; i++){
            int count = 0;
            for (int j = 0; j < mat[i].length; j++){
                if (mat[i][j] == 1){
                    count++;
                }
            }
            if (count > max_count){
                max_count = count;
                arr[1] = max_count;
                arr[0] = i;
            }
        }
        return arr;
    }
}