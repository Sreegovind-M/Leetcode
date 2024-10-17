class MinStack {
    Stack<Integer> st;
    Stack<Integer> mi;
    public MinStack() {
        st = new Stack<>();
        mi = new Stack<>();
    }
    
    public void push(int val) {
        if (st.isEmpty()){
            st.push(val);
            mi.push(val);
        }
        else {
            if (val < mi.peek()){
                mi.push(val);
            }
            else {
                mi.push(mi.peek());
            }
            st.push(val);
        }
    }
    
    public void pop() {
        st.pop();
        mi.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return mi.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */