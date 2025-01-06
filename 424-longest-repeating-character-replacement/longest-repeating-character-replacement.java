class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        HashMap<Character, Integer> map = new HashMap<>();
        int maxi = 0;
        int l = 0;
        int r = 0;
        int maxFreq = 0;

        while (r < n){
            char c = s.charAt(r);
            map.put(c, map.getOrDefault(c, 0) + 1);
            maxFreq = Math.max(maxFreq, map.get(c));
            while ((r - l + 1) - maxFreq > k){
                char left_char = s.charAt(l);
                map.put(left_char, map.get(left_char) - 1);
                l++;
            }
            maxi = Math.max(maxi, r - l + 1);
            r++;
        }
        return maxi;
    }
}