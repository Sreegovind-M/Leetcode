class Solution {
    public boolean exist(char[][] board, String word) {
        int n = board.length;
        int m = board[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (word.charAt(0) == board[i][j]) {
                    boolean visited[][] = new boolean[n][m];
                    String s = "";
                    if (find(board, i, j, 0, word, s, visited)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public boolean find(char[][] board, int i, int j, int ind, String word, String temp, boolean[][] visited) {
        if (ind == word.length()) {
            return true;
        }
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length) {
            return false;
        }
        if (board[i][j] != word.charAt(ind) || visited[i][j] == true) {
            return false;
        }
        visited[i][j] = true;
        boolean up = find(board, i - 1, j, ind + 1, word, temp + board[i][j], visited);
        boolean down = find(board, i + 1, j, ind + 1, word, temp + board[i][j], visited);
        boolean left = find(board, i, j - 1, ind + 1, word, temp + board[i][j], visited);
        boolean right = find(board, i, j + 1, ind + 1, word, temp + board[i][j], visited);
        visited[i][j] = false;

        return up || down || left || right;
    }
}