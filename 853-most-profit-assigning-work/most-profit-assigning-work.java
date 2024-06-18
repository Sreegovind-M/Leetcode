class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int max_diff = 0;

        for (int i : difficulty){
            max_diff = Math.max(i, max_diff);
        }
        int arr[] = new int[max_diff + 1];
        for (int i = 0; i < difficulty.length; i++){
            arr[difficulty[i]] = Math.max(arr[difficulty[i]], profit[i]);
        }
        for (int i = 1; i <= max_diff; i++){
            arr[i] = Math.max(arr[i], arr[i - 1]);
        }

        int tot = 0;
        for (int ability : worker){
            if (ability > max_diff){
                tot += arr[max_diff];
            }
            else {
                tot += arr[ability];
            }
        }
        return tot;
    }
}