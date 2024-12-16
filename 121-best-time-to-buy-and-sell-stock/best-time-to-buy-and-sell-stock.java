class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;

        int i = 0;
        int j = 0;
        int mini = prices[i];
        int maxi = 0;
        while (j < n){
            if (prices[j] < mini){
                mini = prices[j];
            }
            maxi = Math.max(prices[j] - mini, maxi);
            j++;
        }  
        return maxi;
    }
}