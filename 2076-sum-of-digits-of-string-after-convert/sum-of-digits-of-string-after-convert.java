class Solution {
    public int getLucky(String s, int k) {
        int n = s.length();

        String temp = "";
        for (int i = 0; i < n; i++){
            String t = (s.charAt(i) - 96) + "";
            temp += t;
        }
        int res = 0;
        while (k > 0){
            res = 0;
            for (int i = 0; i < temp.length(); i++){
                int num = Integer.parseInt(temp.charAt(i) + "");
                res += num;
            }
            temp = String.valueOf(res);
            k--;
        }
        return res;
    }
}