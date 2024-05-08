class Solution {
    public String[] findRelativeRanks(int[] score) {
        int arr[] = score.clone();
        int n = score.length;
        Arrays.sort(arr);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++){
            map.put(arr[i], i + 1);
        }

        String res[] = new String[n];

        for (int i = 0; i < n; i++){
            int placing = map.get(score[i]);
            placing = n - placing;

            if (placing == 0){
                res[i] = "Gold Medal";
            }
            else if (placing == 1){
                res[i] = "Silver Medal";
            }
            else if (placing == 2){
                res[i] = "Bronze Medal";
            }
            else {
                String c = Integer.toString(placing + 1);
                res[i] = c;
            }
        }

        return res;
    }
}