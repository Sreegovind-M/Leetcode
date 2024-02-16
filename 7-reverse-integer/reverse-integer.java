class Solution {
    public int reverse(int x) {
        long num = 0;
        int temp = x;
        while (x != 0){
            int rem = x % 10;
            num = (num * 10) + rem;
            x /= 10;
        }
        if (num > 2147483647 || num < -2147483648){
            return 0;
        }
        
        return (int)num;
    }
}