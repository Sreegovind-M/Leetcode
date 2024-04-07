class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();

        StringBuilder sb = new StringBuilder(s);
        String res = sb.reverse().toString();


        return res.equals(s);
    }
}