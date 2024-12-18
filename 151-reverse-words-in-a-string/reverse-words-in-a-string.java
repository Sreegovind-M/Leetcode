class Solution {
    public String reverseWords(String s) {
        ArrayList<String> al = new ArrayList<>();
        
        int n = s.length();
        int i = 0;
        int j = 0;
        while (i < n){
            if (s.charAt(i) == ' '){
                while (i < n && s.charAt(i) == ' '){
                    i++;
                }
            }
            else {
                String temp = "";
                while (i < n && s.charAt(i) != ' '){
                    temp += s.charAt(i);
                    i++;
                }
                al.add(temp);
            }
        }
        String res = "";
        for (i = al.size() - 1; i > 0; i--){
            res += al.get(i) + " ";
        }
        res += al.get(0);
        return res;
    }
}