class Solution {
    public String removeOuterParentheses(String s) {
        int n = s.length();

        String res = "";
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);

            if (st.isEmpty()) {
                st.push(c);
            }
            else {
                if (c == ')') {
                    st.pop();
                    if (!st.isEmpty()) {
                        res += c;
                    }
                }
                else {
                    st.push(c);
                    res += c;
                }

            }
            
        }
        System.out.println(st);
        return res;
    }
}