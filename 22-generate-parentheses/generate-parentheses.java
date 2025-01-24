class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> al = new ArrayList<>();
        generate("", al, 0, 0, n);

        return al;
    }
    public void generate(String s, List<String> al, int open, int close, int n){
        if (open == n && close == n){
            al.add(s);
            return;
        }
        if (open < n){
            generate(s + "(", al, open + 1, close, n);
        }
        if (close < open){
            generate(s + ")", al, open, close + 1, n);
        }
    }
}