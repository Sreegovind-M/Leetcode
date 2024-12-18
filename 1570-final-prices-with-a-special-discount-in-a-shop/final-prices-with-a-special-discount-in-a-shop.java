class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        int res[] = new int[n];

        int i = 0;
        for (i = 0; i < n - 1; i++){
            int mini = -1;
            for (int j = i + 1; j < n; j++){
                if (prices[j] <= prices[i]){
                    mini = prices[j];
                    break;
                }
            }
            res[i] = (mini == -1 ? prices[i] : prices[i] - mini);
        }
        res[n - 1] = prices[n - 1];
        return res; 
    }
}