class Solution {
    public int beautySum(String s) {
        int res = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            int freq[] = new int[26];
            for (int j = i; j < n; j++) {
                int maxi = Integer.MIN_VALUE;
                int mini = Integer.MAX_VALUE;
                freq[s.charAt(j) - 'a']++;
                for (int k = 0; k < 26; k++) {
                    if (freq[k] > 0) {
                        maxi = Math.max(maxi, freq[k]);
                        mini = Math.min(mini, freq[k]);
                    }
                }
                res += maxi - mini;
            }
        }
        return res;
    }
}