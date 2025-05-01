class Solution {
    public int[][] merge(int[][] intervals) {
        HashMap<Integer, Integer> map = new HashMap<>();

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        int n = intervals.length;
        int x = intervals[0][0];
        int y = intervals[0][1];
        for (int i = 0; i < n; i++) {
            if (intervals[i][0] <= y) {
                y = Math.max(intervals[i][1], y);
            }
            else {
                map.put(x, y);
                x = intervals[i][0];
                y = intervals[i][1];
            }
        }
        if (!map.containsKey(x)) {
            map.put(x, y);
        }
        int res[][] = new int[map.size()][2];
        
        int i = 0;
        for (var m : map.entrySet()) {
            res[i][0] = m.getKey();
            res[i][1] = m.getValue();
            i++;
        }

        return res;
    }
}