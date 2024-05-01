class Solution {
    public String reversePrefix(String word, char ch) {
        int ind = word.indexOf(ch);

        if (ind == -1){
            return word;
        }
        StringBuilder sb = new StringBuilder(word.substring(0, ind + 1));
        String res = sb.reverse().toString();

        if (ind == word.length()){
            return res;
        }
        res += word.substring(ind + 1, word.length());
        return res;
    }
}