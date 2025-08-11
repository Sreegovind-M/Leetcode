class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        List<String> al = new ArrayList<>();

        find(s, 0, al, res);

        return res;
    }
    public void find(String s, int ind, List<String> al, List<List<String>> res) {
        if (ind == s.length()) {
            for (String x : al) {
                if (!isPalindrome(x)) {
                    return;
                }
            }
            res.add(new ArrayList<>(al));
            return;
        }
        System.out.println(al);

        for (int i = ind; i < s.length(); i++) {
            if (isPalindrome(s.substring(ind, i + 1))) {
                al.add(s.substring(ind, i + 1));
                find(s, i + 1, al, res);
                al.remove(al.size() - 1);
            }
        }

    }
    public boolean isPalindrome(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString().equals(str);
    }
}