class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int freq1[] = new int[26];
        for (char c : ransomNote.toCharArray()){
            freq1[c - 'a']++;
        }
        int freq2[] = new int[26];
        for (char c : magazine.toCharArray()){
            freq1[c - 'a']--;
        }

        for (int i = 0; i < 26; i++){
            if (freq1[i] > 0){
                return false;
            }
        }
        return true;
    }
}