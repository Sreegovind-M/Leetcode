class Solution {
    public int minLength(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        for (int i = 0; i < n; i++){
            char c = s.charAt(i);
            if (!st.isEmpty() && (st.peek() == 'A' && c == 'B')){
                st.pop();
            }
            else if (!st.isEmpty() && (st.peek() == 'C' && c == 'D')){
                st.pop();
            }
            else st.push(c);
        }
        System.out.println(st);
        return st.size();
    }
}