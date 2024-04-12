class Solution {
    public String interpret(String command) {
        String res = command.replace("(al)", "al").replace("()", "o");
        
        return res;
    }
}