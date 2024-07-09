class Solution {
    public double averageWaitingTime(int[][] customers) {
        long busy = 0, wt = 0;
        for (int i = 0; i < customers.length; i++){
            long arr = customers[i][0];
            int time = customers[i][1];
            wt += (Math.max(arr, busy) + time) - arr;
            busy = Math.max(arr, busy) + time; 
        }
        return (wt * 1.0) / customers.length;
    }
}