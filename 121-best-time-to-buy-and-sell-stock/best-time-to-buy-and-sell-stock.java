class Solution {
    public int maxProfit(int[] prices) {
        int maxi = 0;
        int n = prices.length;

        int mini = prices[0];
        for (int i = 0; i < n; i++) {
            mini = Math.min(prices[i], mini);
            maxi = Math.max(prices[i] - mini, maxi);
        }
        return maxi;
    }
}