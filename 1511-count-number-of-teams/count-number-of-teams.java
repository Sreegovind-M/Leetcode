class Solution {
    public int numTeams(int[] rating) {
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();

        int inc = 0;
        int dec = 0;
        for (int i = 0; i < rating.length; i++){

            for (int j = i + 1; j < rating.length; j++){
                for (int k = j + 1; k < rating.length; k++){
                    if ((rating[i] > rating[j] && rating[j] > rating[k])){
                        inc++;
                    }
                    else if (rating[i] < rating[j] && rating[j] < rating[k]){
                        dec++;
                    }
                }
            }
        }
        return inc + dec;
    }

}