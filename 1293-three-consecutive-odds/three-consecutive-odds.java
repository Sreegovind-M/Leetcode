class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int n = arr.length;
        if (n < 3){
            return false;
        }

        for (int i = 0; i <= n - 3; i++){
            if (oddcheck(arr[i]) && oddcheck(arr[i + 1]) && oddcheck(arr[i + 2])){
                return true;
            }
        }
        return false;
    }
    public boolean oddcheck(int n){
        return (n % 2 != 0);
    }
}