class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        int n = intervals.length;
        int m = intervals[0].length;

        int start = intervals[0][0];
        int end = intervals[0][1];

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 1; i < n; i++) {
            if (intervals[i][0] <= end) {
                end = Math.max(end, intervals[i][1]);
                start = Math.min(start, intervals[i][0]);
            }
            else {
                map.put(start, end);
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        if (!map.containsKey(start)) {
            map.put(start, end);
        }
        int res[][] = new int[map.size()][2];
        int i = 0;
        for (var x : map.entrySet()) {
            res[i][0] = x.getKey();
            res[i][1] = x.getValue();
            i++;
        }
        return res;
    }
}