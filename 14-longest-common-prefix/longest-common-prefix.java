class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];
        int len = first.length() < last.length() ? first.length() : last.length();
        int i = 0;
        while (i < len){
            if (first.charAt(i) != last.charAt(i)){
                break;
            }
            i++;
        }
        return first.substring(0, i);
    }
}