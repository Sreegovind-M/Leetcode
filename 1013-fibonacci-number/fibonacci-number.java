class Solution {
    public int fib(int n) {
        if (n <= 1) return n;
        int[] m = new int[n + 1];
        for (int i = 0; i <= n; m[i++]=-1);
        m[0] = 0; m[1] = 1;
        return fibHelper(n, m);
    }
    private int fibHelper(int n, int[] m) {
        if (m[n] != -1) return m[n];
        return fibHelper(n - 1, m) + fibHelper(n - 2, m);
    }
}