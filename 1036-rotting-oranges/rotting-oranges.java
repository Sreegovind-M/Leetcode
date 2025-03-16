class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<Pair> que = new LinkedList<>();
        int n = grid.length;
        int m = grid[0].length;

        int count_1 = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 2) {
                    que.add(new Pair(i, j, 0));
                }

                if (grid[i][j] == 1) {
                    count_1++;
                }
            }
        }
        int change = 0;
        int sec = 0;
        if (count_1 == change) {
            return sec;
        }
        while (!que.isEmpty()) {
            Pair p = que.poll();

            int x_co = p.x;
            int y_co = p.y;
            int tm = p.time;
            sec = tm;
            if (x_co - 1 >= 0 && grid[x_co - 1][y_co] == 1) {
                change++;
                grid[x_co - 1][y_co] = 2;
                que.add(new Pair(x_co - 1, y_co, tm + 1));
            }
            if (x_co + 1 < n && grid[x_co + 1][y_co] == 1) {
                change++;
                grid[x_co + 1][y_co] = 2;
                que.add(new Pair(x_co + 1, y_co, tm + 1));
            }
            if (y_co + 1 < m && grid[x_co][y_co + 1] == 1) {
                change++;
                grid[x_co][y_co + 1] = 2;
                que.add(new Pair(x_co, y_co + 1, tm + 1));
            }
            if (y_co - 1 >= 0 && grid[x_co][y_co - 1] == 1) {
                change++;
                grid[x_co][y_co - 1] = 2;
                que.add(new Pair(x_co, y_co - 1, tm + 1));
            }
        }
        if (change == count_1) {
            return sec;
        }
        return -1;
    }
}
class Pair {
    int x;
    int y;
    int time;
    Pair(int x, int y, int time) {
        this.x = x;
        this.y = y;
        this.time = time;
    }
}