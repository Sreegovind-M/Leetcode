class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        long res = 0;
        Arrays.sort(happiness);

        int t = 0;

        for (int i = happiness.length - 1; i >= 0; i--){
            if (t == k){
                break;
            }
            res += Math.max(0, happiness[i] - t);
            t++;
        }

        return res;
    }
}