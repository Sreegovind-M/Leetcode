class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int lsum = 0;
        int rsum = 0;

        for (int i = 0; i < k; i++) {
            lsum += cardPoints[i];
        }
        if (k == cardPoints.length) return lsum;

        int r = cardPoints.length - 1;
        int maxi = lsum;

        for (int i = k - 1; i >= 0; i--) {
            lsum -= cardPoints[i];
            rsum += cardPoints[r];
            r--;
            maxi = Math.max(lsum + rsum, maxi);
        }
        return maxi;
    }
}