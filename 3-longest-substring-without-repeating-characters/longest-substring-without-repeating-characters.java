class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxi = 1;
        int l = 0;
        int n = s.length();

        if (n == 0) return 0;


        Set<Character> al = new HashSet<>();
        for (int r = 0; r < n; r++) {
            if (al.contains(s.charAt(r))){
                while (al.contains(s.charAt(r))){
                    al.remove(s.charAt(l));
                    l++;
                }
                al.add(s.charAt(r));
            }
            else {
                al.add(s.charAt(r));
                maxi = Math.max(maxi, r - l + 1);
            }
        }
        return maxi;
    }
}