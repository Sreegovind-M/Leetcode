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
        String res = "";
        for (char c : st){
            res += c;
        }
        return res;
    }
}