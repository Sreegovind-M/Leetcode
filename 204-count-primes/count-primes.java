class Solution {
    public int countPrimes(int n) {
        if (n <= 1) return 0;
        
        int count = 0;
        boolean arr[] = new boolean[n];
        Arrays.fill(arr, true);

        for (int i = 2; i * i < n; i++){
            if (arr[i] == true){
                for (int j = i * i; j < n; j += i){
                    arr[j] = false;
                }
            }
        }

        for (int i = 2; i < n; i++){
            if (arr[i] == true){
                count++;
            }
        }
        return count;

    }
}