class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++){
            char arr[] = strs[i].toCharArray();
            Arrays.sort(arr);

            String word = new String(arr);
            
            if (!map.containsKey(word)){
                map.put(word, new ArrayList<>());
            }
            map.get(word).add(strs[i]);
        }
        System.out.println(map);

        return new ArrayList<>(map.values());
    }
}