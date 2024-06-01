class Solution {
    public int scoreOfString(String s) {
        int res = 0;
        for (int i = 1; i < s.length(); i++){
            int x = s.charAt(i);
            int y = s.charAt(i - 1);

            res += Math.abs(x - y);
        }
        return res;
    }
}