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
            switch(c){
                case '}' -> { if( st.isEmpty() || st.pop() != '{') return false;}
                case ']' -> { if( st.isEmpty() || st.pop() != '[') return false;}
                case ')' -> { if( st.isEmpty() || st.pop() != '(') return false;}
                default -> st.push(c);
            }
        }
        return st.isEmpty();
    }
}