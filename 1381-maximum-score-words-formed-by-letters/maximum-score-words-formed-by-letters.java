class Solution {
    public int maxScoreWords(String[] words, char[] letters, int[] score) {
        int n = words.length;
        int res = 0;

        int letters_count[] = new int[26];

        for (char c : letters){
            int ind = c - 'a';
            letters_count[ind]++;
        }

        Map<String, Integer> words_score = new HashMap<>();

        for (String word : words){
            int tot = 0;

            for (int i = 0; i < word.length(); i++){
                int ind = word.charAt(i) - 'a';
                tot += score[ind];
            }
            words_score.put(word, tot);
        }

        for (int mask = 0; mask < (1 << n); mask++){
            int cur_score = 0;
            int cur_freq[] = new int[26];
            boolean check = true;

            for (int i = 0; i < n; i++){
                if ((mask & (1 << i)) != 0){
                    String word = words[i];
                    cur_score += words_score.get(word);

                    for (int j = 0; j < word.length(); j++){
                        int ind = word.charAt(j) - 'a';
                        cur_freq[ind]++;
                        if (cur_freq[ind] > letters_count[ind]){
                            check = false;
                            break;
                        }
                    }
                }

                if (check == false){
                    break;
                }
            }
            if (check && cur_score > res){
                res = cur_score;
            }
        }
        return res;
    }
}