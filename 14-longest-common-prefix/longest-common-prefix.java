class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);

        String x = strs[0];
        String y = strs[strs.length - 1];

        String res = "";
        for (int i = 0; i < Math.min(x.length(), y.length()); i++) {
            if (x.charAt(i) == y.charAt(i)) {
                res += x.charAt(i);
            }
            else break;
        }
        return res;
    }
}