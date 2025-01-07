class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> res = new ArrayList<>();
        List<String> al = new ArrayList<>();
        Arrays.sort(words, Comparator.comparing(s->s.length()));
        for (int j = words.length - 1; j >= 0; j--){
            String s = words[j];
            for (int i = j - 1; i >= 0; i--){
                if (s.contains(words[i])){
                    if (!res.contains(words[i])){
                        res.add(words[i]);
                    }
                }
            }
        }
        return res;
    }
}