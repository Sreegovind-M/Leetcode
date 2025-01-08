class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        return (findNumber(firstWord) + findNumber(secondWord)) == findNumber(targetWord);
    }
    public int findNumber(String s){
        int number = 0;

        for (int i = 0; i < s.length(); i++){
            int x = s.charAt(i) - 'a';
            number = (number * 10) + x;
        }
        return number;
    }
}