class Solution {
    public void reverseString(char[] s) {
       int n = s.length / 2;
       int j = s.length - 1;
       int i = 0;

       while (i <= j){
            char c = s[i];
            s[i] = s[j];
            s[j] = c;
            j--;
            i++;
       }
    }
}