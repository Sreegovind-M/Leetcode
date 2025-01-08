class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int num1 = findNumber(firstWord);
        int num2 = findNumber(secondWord);
        int sum = findNumber(targetWord);

        return (num1 + num2) == sum;
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