class Solution {
    public String interpret(String command) {
        String res = "";

        for (int i = 0; i < command.length(); i++){
            if (command.charAt(i) >= 'a' && command.charAt(i) <= 'z' || command.charAt(i) == 'G'){
                res += command.charAt(i);
            }
            else if (command.charAt(i) == '(' && command.charAt(i + 1) == ')'){
                res += 'o';
            }
        }
        return res;
    }
}