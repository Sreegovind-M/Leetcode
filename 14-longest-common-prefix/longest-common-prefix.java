class Solution {
    public String longestCommonPrefix(String[] strs) {
        String res = "";
        Arrays.sort(strs);

        String first = strs[0];
        String last = strs[strs.length - 1];
        
        for (int i = 0; i < Math.min(first.length(), last.length()); i++){
            if (first.charAt(i) != last.charAt(i)){
                return res;
            }
            res += first.charAt(i);
        }
        return res;
    }
}