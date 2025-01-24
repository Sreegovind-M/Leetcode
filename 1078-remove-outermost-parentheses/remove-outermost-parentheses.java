class Solution {
    public String removeOuterParentheses(String s) {
        int n = s.length();

        Stack<Character> st = new Stack<>();

        String temp = "";
        for (int i = 0; i < n; i++){
            if (s.charAt(i) == '('){
                if (!st.isEmpty()){
                    temp += s.charAt(i);
                }
                st.push(s.charAt(i));
            }
            else {
                if (st.size() != 1){
                    temp += s.charAt(i);
                }
                st.pop();
            }
        }
        return temp;
    }
}