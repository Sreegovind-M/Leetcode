class Solution {
    public int[][] merge(int[][] intervals) {
        HashMap<Integer, Integer> map = new HashMap<>();

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        int n = intervals.length;
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(intervals[i]));
        }
        int i = 0;
        while (i < n) {
            int x = intervals[i][0];
            int y = intervals[i][1];

            int j = i + 1;
            int temp = y;
            while (j < n && intervals[j][0] <= temp) {
                temp = Math.max(intervals[j][1], temp);
                j++;
            }
            System.out.println(i);
            map.put(x, temp);
            i = j;
        }
        int res[][] = new int[map.size()][2];
        
        i = 0;
        for (var m : map.entrySet()) {
            res[i][0] = m.getKey();
            res[i][1] = m.getValue();
            i++;
        }

        return res;
    }
}