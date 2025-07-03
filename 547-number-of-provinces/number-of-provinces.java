class Solution {
    public int findCircleNum(int[][] isConnected) {
        int v = isConnected.length;
        boolean visited[] = new boolean[v];

        int comp = 0;
        
        for (int i = 0; i < v; i++) {
            if (visited[i] == false) {
                findComp(isConnected, v, visited, i);
                comp++;
            }
            
        }
        return comp;
    }
    public void findComp(int mat[][], int v, boolean visited[], int node) {
        Queue<Integer> que = new LinkedList<>();
        que.add(node);
        visited[node] = true;
        while (!que.isEmpty()) {
            int curr = que.poll();

            for (int i = 0; i < v; i++) {
                if (mat[curr][i] == 1 && visited[i] == false) {
                    que.add(i);
                    visited[i] = true;
                }
            }
        }
    }
}