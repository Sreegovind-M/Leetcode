class Solution {
    public long maximumImportance(int n, int[][] roads) {
        int deg[] = new int[n];

        for (int r[] : roads){
            deg[r[0]]++;
            deg[r[1]]++;
        }

        Integer cit[] = new Integer[n];
        for (int i = 0; i < n; i++){
            cit[i] = i;
        }
        Arrays.sort(cit, new Comparator<Integer>() {
            public int compare(Integer a, Integer b){
                return Integer.compare(deg[b], deg[a]);
            }
        });

        long tot = 0;
        for (int i = 0; i < n; i++){
            tot += (long) (n - i) * deg[cit[i]];
        }
        return tot;
    }
}