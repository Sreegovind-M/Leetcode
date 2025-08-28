class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();

        List<String> al = new ArrayList<>();
        char[][] mat = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = '.';
            }
        }
        find(n, mat, 0, res);

        return res;
    }
    public void find(int n, char[][] mat, int col, List<List<String>> res) {
        if (col == n) {
            addList(mat, res);
            return;
        }
        for (int i = 0; i < n; i++) {
            if (isSafe(mat, i, col, n)) {
                mat[i][col] = 'Q';
                find(n, mat, col + 1, res);
                mat[i][col] = '.';
            }
        }
    }
    public void addList(char[][] mat, List<List<String>> res) {
        List<String> al = new ArrayList<>();
        for (int i = 0; i < mat.length; i++) {
            String s = "";
            for (int j = 0; j < mat.length; j++) {
                s += mat[i][j];
            }
            al.add(s);
        }
        res.add(al);
    }
    public boolean isSafe(char[][] mat, int x, int y, int n) {
        for (int i = 0; i < y; i++) {
            if (mat[x][i] == 'Q') return false;
        }
        for (int i = x - 1, j = y - 1; i >= 0 && j >= 0; i--, j--) {
            if (mat[i][j] == 'Q') return false;
        }
        for (int i = x + 1, j = y - 1; i < n && j >= 0; i++, j--) {
            if (mat[i][j] == 'Q') return false;
        }
        return true;
    }
}