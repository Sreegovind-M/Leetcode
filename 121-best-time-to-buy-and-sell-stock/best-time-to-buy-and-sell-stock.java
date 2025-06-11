class Solution {
    public int maxProfit(int[] prices) {
        int maxi = 0;
        int n = prices.length;
        int mini = prices[0];
        for (int i = 0; i < n; i++) {
            if (prices[i] < mini) {
                mini = prices[i];
            }
            maxi = Math.max(prices[i] - mini, maxi);
        }
        return maxi;
    }
}