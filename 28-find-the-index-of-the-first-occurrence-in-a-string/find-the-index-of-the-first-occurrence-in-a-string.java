class Solution {
    public int strStr(String haystack, String needle) {
        for (int i = 0; i <= haystack.length() - needle.length(); i++){
            String res = haystack.substring(i, i + needle.length());

            if (res.equals(needle)){
                return i;
            }
        }
        return -1;
    }
}