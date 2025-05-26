class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        if (s.length() != t.length()) {
            return false;
        }
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (!map1.containsKey(s.charAt(i))) {
                map1.put(s.charAt(i), i);
            }
            if (!map2.containsKey(t.charAt(i))) {
                map2.put(t.charAt(i), i);
            }

            if (!map1.get(s.charAt(i)).equals(map2.get(t.charAt(i)))) {
                return false;
            }
        }
        return true;
    }
    
}