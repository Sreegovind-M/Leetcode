class Solution {
    public int tribonacci(int n) {
        if (n <= 1) return n;
        int[] m = new int[n + 1];
        m[0] = 0; m[1] = 1; m[2] = 1;
        for(int ind = 3; ind <=n; m[ind] = m[ind-1] + m[ind-2] + m[ind -3],ind++ );
        return m[n];
    }
}