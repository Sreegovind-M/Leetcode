class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n = asteroids.length;

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++){
            if (asteroids[i] > 0) {
                st.push(asteroids[i]);
            }
            else {
                while (!st.isEmpty() && st.peek() > 0 && Math.abs(asteroids[i]) > st.peek()){
                    st.pop();
                }
                if (st.isEmpty() || st.peek() < 0){
                    st.push(asteroids[i]);
                }
                if (st.peek() == Math.abs(asteroids[i])){
                    st.pop();
                }
            }
        }
        int res[] = new int[st.size()];

        int ind = st.size() - 1;
        while (!st.isEmpty()){
            res[ind--] = st.pop();
        }

        return res;
    }
}