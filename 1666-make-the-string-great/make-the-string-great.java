class Solution {
    public String makeGood(String s) {
        Stack<Character> st = new Stack<>();

        for (char c : s.toCharArray()){
            if (!st.empty() && Math.abs(c - st.peek()) == 32){
                st.pop();
            }
            else{
                st.push(c);
            }
        }
        StringBuilder res = new StringBuilder();
        while (!st.empty()){
            res.insert(0, st.pop());
        }
        return res.toString();
    }
}