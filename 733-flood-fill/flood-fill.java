class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (image[sr][sc] == color) return image;
        
        fillMatrix(image, sr, sc, image.length, image[0].length, color, image[sr][sc]);

        return image;
    }
    public void fillMatrix(int image[][], int x, int y, int n, int m, int color, int srColor) {
        if (x < 0 || y < 0 || x >= n || y >= m) {
            return;
        }
        if (image[x][y] != srColor) return;
        else image[x][y] = color;
        fillMatrix(image, x + 1, y, n, m, color, srColor);
        fillMatrix(image, x - 1, y, n, m, color, srColor);
        fillMatrix(image, x, y - 1, n, m, color, srColor);
        fillMatrix(image, x, y + 1, n, m, color, srColor);

    }

}