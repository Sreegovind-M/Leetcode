class Solution {
    public int maxProfit(int[] prices) {
        int pro = 0, min_price = Integer.MAX_VALUE, max_pro = 0;
        for (int i = 0; i < prices.length; i++){
            if (prices[i] < min_price){
                min_price = prices[i];
            }
            pro = prices[i] - min_price;

            if (pro > max_pro){
                max_pro = pro;
            }
        }
        return max_pro;        
    }
}