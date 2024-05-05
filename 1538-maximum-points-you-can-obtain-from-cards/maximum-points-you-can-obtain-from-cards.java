class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int l_sum = 0;
        for (int i = 0; i < k; i++){
            l_sum += cardPoints[i];
        }

        int max_sum = l_sum;
        int right = cardPoints.length - 1;
        int r_sum = 0;
        for (int i = k - 1; i >= 0; i--){
            l_sum -= cardPoints[i];
            r_sum += cardPoints[right--];
            max_sum = Math.max(max_sum, l_sum + r_sum);
        }
        return max_sum;
    }
}