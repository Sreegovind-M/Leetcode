class Solution {
    public int largestAltitude(int[] gain) {
        int maxi = 0;
        int prev = 0;
        for (int i = 0; i < gain.length; i++){
            gain[i] = prev + gain[i]; 
            maxi = Math.max(gain[i], maxi);
            prev = gain[i];
        }
        return maxi;
    }
}