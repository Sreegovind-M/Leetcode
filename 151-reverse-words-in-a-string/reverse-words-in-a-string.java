class Solution {
    public String reverseWords(String s) {
        s = s.trim();

        int n = s.length();
        int i = s.length() - 1;
        int j = s.length() - 1;

        String res = "";
        int under = 0;
        while (i >= 0) {
            if (s.charAt(i) == ' ') {
                i--;
                continue;
            }
            String temp = "";
            while (i >= 0 && s.charAt(i) != ' ') {
                temp = s.charAt(i) + temp;
                i--;
            }
            res = (res) + temp + " ";
        }
        // System.out.println(temp);
        return res.trim();

    }
}