class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();

        int l = 0;
        int r = s.length() - 1;

        while (l <= r){
            char lc = s.charAt(l);
            char rc = s.charAt(r);

            if (Character.isLetterOrDigit(lc) == false){
                l++;
            }
            else if (Character.isLetterOrDigit(rc) == false){
                r--;
            }
            else {
                if (lc != rc){
                    return false;
                }
                l++;
                r--;
            }
        }
        return true;
    }
}