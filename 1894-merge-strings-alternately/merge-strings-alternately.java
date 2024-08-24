class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        
        String res = "";
        int i = 0;
        int j = 0;
        while (i < Math.min(n, m) && j < Math.min(n, m)){
            res += word1.charAt(i);
            res += word2.charAt(j);
            i++;
            j++;
        }
        if (i != n){
            res += word1.substring(i, n);
        }
        if (j != m){
            res += word2.substring(j, m);
        }

        return res;
    }
}