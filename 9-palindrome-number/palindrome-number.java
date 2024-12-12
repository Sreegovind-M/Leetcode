class Solution {
    public boolean isPalindrome(int x) {
        int val = x;
        int rev = 0;
        
        if (x == 0){
            return true;
        }
        while (x != 0){
            int rem = x % 10;
            rev = (rev * 10) + rem;
            x /= 10;
        }
        if (val < 0){
            rev = -rev;
        }
        return rev == val;
    }
}