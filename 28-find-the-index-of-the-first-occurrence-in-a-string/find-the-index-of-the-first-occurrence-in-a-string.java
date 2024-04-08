class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length() > haystack.length()){
            return -1;
        }
        int n = haystack.length();
        int m = needle.length();
        for (int i = 0; i <= n - m; i++){
            String sub = haystack.substring(i, i + m);
            
            if (sub.equals(needle)){
                return i;
            }
        }
        return -1;
    }
}