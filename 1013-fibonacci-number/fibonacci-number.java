class Solution {
    // private static int[][] matrixMultiply(int[][] A, int[][] B) {
    //     int[][] result = new int[2][2];
    //     result[0][0] = A[0][0] * B[0][0] + A[0][1] * B[1][0];
    //     result[0][1] = A[0][0] * B[0][1] + A[0][1] * B[1][1];
    //     result[1][0] = A[1][0] * B[0][0] + A[1][1] * B[1][0];
    //     result[1][1] = A[1][0] * B[0][1] + A[1][1] * B[1][1];
    //     return result;
    // }
    // private static int[][] matrixPower(int[][] base, int exp) {
    //     int[][] result = new int[][]{{1, 0}, {0, 1}};
    //     while (exp > 0) {
    //         if (exp % 2 == 1) result = matrixMultiply(result, base);
    //         base = matrixMultiply(base, base);
    //         exp /= 2; 
    //     }
    //     return result;
    // }
    // public static int fib(int n) {
    //     if (n == 0) return 0;
    //     if (n == 1) return 1;
    //     int[][] T = {{1, 1}, {1, 0}};
    //     int[][] resultMatrix = matrixPower(T, n - 1);
    //     return resultMatrix[0][0];
    // }
    // public int fib(int n) {
    //     if (n <= 1) return n;
    //     int[] m = new int[n + 1];
    //     m[0] = 0; m[1] = 1;
    //     for(int ind = 2; ind <=n; m[ind] = m[ind-1] + m[ind-2],ind++ );
    //     return m[n];
    // }
    public int fib(int n){
        if(n<=1) return n;
        int [] f = new int[n+1];
        //for(int i = 0; i<=n; f[i++] = -1);
        if(f[n] != 0) return f[n];
        return fib(n-1) + fib(n-2);
    }
}