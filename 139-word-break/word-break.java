class Solution {
    public boolean wordBreak(String s, List<String> al) {
        Set<String> wordDict = new HashSet<>(al);
        int n = s.length();
        int maxLen = 0;
        for (String x : wordDict) {
            maxLen = Math.max(maxLen, x.length());
        }
        boolean arr[] = new boolean[n + 1];
        arr[0] = true;

        for (int i = 1; i <= n; i++) {
            for (int j = i - 1; j >= Math.max(0, i - maxLen); j--) {
                if (arr[j] == true && wordDict.contains(s.substring(j, i))) {
                    arr[i] = true;
                    break;
                }
            }
        }
        return arr[n];
    }
}