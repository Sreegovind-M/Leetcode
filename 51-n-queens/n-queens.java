class Solution {
    public List<List<String>> solveNQueens(int n) {
        char board[][] = new char[n][n];
        List<List<String>> res = new ArrayList<>();

        n_queen(board, n, 0, res);
        return res;
    }

    public void arr_list(char board[][], int n, List<List<String>> res){

        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++){
            String temp = "";
            for (int j = 0; j < n; j++){
                if (board[i][j] == 'Q'){
                    temp += "Q";
                }
                else {
                    temp += ".";
                }
            }
            list.add(temp);
        }
        res.add(list);
    }

    public void n_queen(char board[][], int n, int col, List<List<String>> res){
        if (col == n){
            arr_list(board, n, res);
            return;
        }
        for (int i = 0; i < n; i++){
            if (safe(board, i, col, n)){
                board[i][col] = 'Q';
                n_queen(board, n, col + 1, res);
                board[i][col] = '.'; 
            }
        }
    }
    public boolean safe(char board[][], int x, int y, int n){
        //Horizontal Left
        for (int i = 0; i < y; i++){
            if (board[x][i] == 'Q'){
                return false;
            }
        }

        //Left Down Diagonal
        for (int i = x, j = y; i < n && j >= 0; i++, j--){
            if (board[i][j] == 'Q'){
                return false;
            }
        }

        //Left Up Diagonal
        for (int i = x, j = y; i >= 0 && j >= 0; i--, j--){
            if (board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }
}