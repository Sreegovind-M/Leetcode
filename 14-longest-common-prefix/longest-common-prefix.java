class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        System.out.println(Arrays.toString(strs));

        String first = strs[0];
        String last = strs[strs.length - 1];
        String res = "";
        for (int i = 0; i < Math.min(first.length(), last.length()); i++){
            if (first.charAt(i) == last.charAt(i)){
                res += first.charAt(i);
            }
            else {
                break;
            }
        }

        return res;
    }
}