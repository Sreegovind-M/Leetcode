class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        // for (char c : s.toCharArray()){
        //     if (c == '(' || c == '[' || c == '{'){
        //         st.push(c);
        //     }
        //     else {
        //         if (st.empty()){
        //             return false;
        //         }
        //         else if (c == ')' && st.peek() == '('){
        //             st.pop();
        //         }
        //         else if (c == ']' && st.peek() == '['){
        //             st.pop();
        //         }
        //         else if (c == '}' && st.peek() == '{'){
        //             st.pop();
        //         }
        //         else {
        //             return false;
        //         }
        //     }
            
        // }
        // return st.empty();
        for(char c : s.toCharArray())
        {
            if(c == '(') st.push(')');
            if(c == '[') st.push(']');
            if(c == '{') st.push('}');
            if(c == ']' || c == ')' || c == '}')
                if(st.isEmpty() || st.pop() != c) return false;
        }
        return st.isEmpty();
    }
}