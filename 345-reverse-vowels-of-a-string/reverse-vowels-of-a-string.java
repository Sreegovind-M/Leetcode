class Solution {
    public String reverseVowels(String s) {
        String vows = "";
        for (char c : s.toCharArray()){
            if (isvowel(c)){
                vows += c;
            }
        }
        String res = "";
        int j = vows.length() - 1;
        for (int i = 0; i < s.length(); i++){
            if (isvowel(s.charAt(i))){
                res += vows.charAt(j--);
            }
            else {
                res += s.charAt(i);
            }
        }
        return res;
    }   
    public boolean isvowel(char c){
        char x = Character.toLowerCase(c);

        if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u'){
            return true;
        }
        return false;
    }
}