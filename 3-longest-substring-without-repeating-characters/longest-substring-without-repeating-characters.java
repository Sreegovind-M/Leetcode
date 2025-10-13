class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int r = 0;
        int n = s.length();
        int maxi = 0;

        List<Character> al = new ArrayList<>();
        while (r < n) {
            while (al.contains(s.charAt(r))) {
                al.remove(al.indexOf(s.charAt(l)));
                l++;
            }
            al.add(s.charAt(r));
            maxi = Math.max(maxi, r - l + 1);
            r++;
        }
        return maxi;
    }
}