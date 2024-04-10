class Solution {
    public boolean isAcronym(List<String> words, String s) {
        String res = "";
        for (String x : words){
            res += x.charAt(0);
        }
        return res.equals(s);
    }
}