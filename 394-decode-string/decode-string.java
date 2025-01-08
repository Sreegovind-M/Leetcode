class Solution {
    public String decodeString(String s) {
        int n = s.length();

        Stack<Character> st = new Stack<>();
        String res = "";

        for (int i = 0; i < n; i++){
            char c = s.charAt(i);
            if (c == ']'){
                String temp = "";
                while (st.peek() != '['){
                    temp = st.pop() + temp;
                }
                st.pop();
                String number = "";
                while (!st.isEmpty() && (st.peek() >= '0' && st.peek() <= '9')){
                    number = st.pop() + number;
                }
                int num = Integer.parseInt(number);
                String occ = "";
                for (int j = 1; j <= num; j++){
                    occ += temp;
                }
                for (int j = 0; j < occ.length(); j++){
                    st.push(occ.charAt(j));
                }
            }
            else {
                st.push(c);
            }
        }

        while (!st.isEmpty()){
            res = st.pop() + res;
        }
        
        return res;
    }
}