class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n = image.length;
        int m = image[0].length;

        Queue<Pair> que = new LinkedList<>();
        que.add(new Pair(sr, sc));

        int org = image[sr][sc];

        if (org == color) return image;
        image[sr][sc] = color;
        
        int dr[] = {-1, 1, 0, 0};
        int dc[] = {0, 0, -1, 1};
        while (!que.isEmpty()) {
            Pair temp = que.poll();
            int cu_row = temp.row;
            int cu_col = temp.col;

            for (int i = 0; i < 4; i++) {
                int newRow = dr[i] + cu_row;
                int newCol = dc[i] + cu_col;

                if (newRow >= 0 && newCol >= 0 && newRow < n && newCol < m && image[newRow][newCol] == org) {
                    que.add(new Pair(newRow, newCol));
                    image[newRow][newCol] = color;
                }
            }
        }

        return image;
    }
}
class Pair {
    int row;
    int col;
    Pair (int row, int col) {
        this.row = row;
        this.col = col;
    }
}