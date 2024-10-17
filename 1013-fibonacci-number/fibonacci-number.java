class Solution {
    public int fib(int n) {
        if (n <= 1) return n;
        int[] m = new int[n + 1];
        //for (int i = 0; i <= n; m[i++]=0);
        m[0] = 0; m[1] = 1;
        for(int ind = 2; ind <=n; m[ind] = m[ind-1] + m[ind-2],ind++ );
        return m[n];
    }
}