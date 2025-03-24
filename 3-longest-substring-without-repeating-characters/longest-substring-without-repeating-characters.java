class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if (n == 0) {
            return 0;
        }
        int l = 0;
        int r = 0;
        int maxi = 1;
        List<Character> al = new ArrayList<>();
        while (r < n) {
            while (al.contains(s.charAt(r))) {
                al.remove(al.indexOf(s.charAt(l)));
                l++;
            }
            al.add(s.charAt(r));
            maxi = Math.max(maxi, al.size());
            r++;
        }
        return maxi;
    }
}