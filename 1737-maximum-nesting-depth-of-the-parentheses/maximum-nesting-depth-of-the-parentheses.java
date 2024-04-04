class Solution {
    public int maxDepth(String s) {
        int count = 0;
        int max_count = 0;
        for (char a : s.toCharArray()){
            if (a == '('){
                count++;
            }
            if (a == ')'){
                count--;
            }
            max_count = Math.max(count, max_count);
        }
        return max_count;
    }
}