class Solution {
    public int longestPalindrome(String s) {
        int no_of_odd_letter = 0;
        int freq_of_odd_letter = 0;
        
        int n = s.length();

        Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (var a : map.entrySet()){
            if (a.getValue() % 2 != 0){
                no_of_odd_letter++;
                freq_of_odd_letter += a.getValue();
            }
        }

        int k = no_of_odd_letter - 1;


        System.out.println(no_of_odd_letter);
        System.out.println(n);
        System.out.println(freq_of_odd_letter);
        return k >= 0 ? n - k : n;
    }
}