class Solution {
    public int mostWordsFound(String[] sentences) {
        int len = 0;
        for (String s : sentences){
            String arr[] = s.split(" ");
            len = Math.max(len, arr.length);
        }
        return len;
    }
}