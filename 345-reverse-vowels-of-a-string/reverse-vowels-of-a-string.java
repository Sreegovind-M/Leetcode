class Solution {
    public String reverseVowels(String s) {
        char arr[] = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;

        while (i < j){
            while (i < j && isvowel(s.charAt(i)) == false){
                i++;
            }
            while (i < j && isvowel(s.charAt(j)) == false){
                j--;
            }
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        String res = new String(arr);
        return res;
    }
    public boolean isvowel(char c){
        c = Character.toLowerCase(c);

        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
            return true;
        }
        return false;
    }
}