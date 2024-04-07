class Solution {
    public boolean checkValidString(String s) {
        int l_min = 0, l_max = 0;

        for (char c : s.toCharArray()){
            

            if (c == '('){
                l_min++;
                l_max++;
            }
            else if (c == ')'){
                l_min--;
                l_max--;
            }
            else {
                l_min--;
                l_max++;
            }
            if (l_max < 0){
                return false;
            }
            if (l_min < 0){
                l_min = 0;
            }
        }

        return l_min == 0;
    }
}