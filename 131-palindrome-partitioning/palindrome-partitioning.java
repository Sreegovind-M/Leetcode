class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        back_track(s, 0, res, new ArrayList<>());

        return res;
    }

    public void back_track(String s, int ind, List<List<String>> res, ArrayList<String> al){

        if (ind == s.length()){
            res.add(new ArrayList<>(al));
        }

        for (int i = ind; i < s.length(); i++){
            if (palindrome(s, ind, i)){
                al.add(s.substring(ind, i + 1));
                back_track(s, i + 1, res, al);
                al.remove(al.size() - 1);
            }
        }
        
    }
    public boolean palindrome(String s, int start, int end){
        while (start <= end){
            if (s.charAt(start++) != s.charAt(end--)){
                return false;
            }
        }
        return true;
    }

}