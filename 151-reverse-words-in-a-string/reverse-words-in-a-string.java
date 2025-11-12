class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        int n = s.length();

        int i = 0;
        String res = "";
        while (i < n) {
            String temp = "";
            while (i < n && s.charAt(i) != ' ') {
                temp += s.charAt(i);
                i++;
            }
            if (!temp.isEmpty()) res = temp + " " + res;
            i++;

        }
        return res.trim();
    }
}