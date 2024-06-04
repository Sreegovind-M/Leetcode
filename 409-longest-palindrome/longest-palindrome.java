class Solution {
    public int longestPalindrome(String s) {
        int no_of_odd_letter = 0;        
        int n = s.length();
        Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (var a : map.entrySet()){
            if (a.getValue() % 2 != 0){
                no_of_odd_letter++;
            }
        }
        return no_of_odd_letter - 1 >= 0 ? n - (no_of_odd_letter - 1) : n;
    }
}