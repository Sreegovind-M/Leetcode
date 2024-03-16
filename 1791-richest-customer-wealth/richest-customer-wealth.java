class Solution {
    public int maximumWealth(int[][] accounts) {
        int res = 0;
        for (int i = 0; i < accounts.length; i++){
            int sum = 0;
            for (int j : accounts[i]){
                sum += j;
            }
            res = Math.max(sum, res);
        }
        return res;
    }
}