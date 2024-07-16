class Solution {
    public int reverse(int x) {
        long res = 0;

        while (x != 0){
            int rem = x % 10;
            res = (res * 10) + rem;
            x /= 10;
        }
        if (res > -2147483648 && res < 2147483647){
            return (int)res;
        }
        return 0;
    }
}