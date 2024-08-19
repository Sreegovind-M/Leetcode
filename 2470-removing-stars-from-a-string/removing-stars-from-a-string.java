class Solution {
    public String removeStars(String s) {
        String res = "";
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()){
            if (c == '*' && !st.empty()){
                st.pop();
            }
            else {
                st.push(c);
            }
        }
        while (!st.empty()){
            res += st.pop();
        }
        StringBuilder sb = new StringBuilder(res);
        return sb.reverse().toString();
    }
}