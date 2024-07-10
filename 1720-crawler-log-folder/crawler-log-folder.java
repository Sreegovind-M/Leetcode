class Solution {
    public int minOperations(String[] logs) {
        Stack<String> st = new Stack<>();
        for (String s : logs){
            if (s.equals("./")){
                continue;
            }
            else if (s.equals("../")){
                if (!st.isEmpty()){
                    st.pop();
                }
            }
            else {
                st.push(s);
            }
        }
        return st.size();
    }
}