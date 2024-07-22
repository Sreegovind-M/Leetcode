class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer, String> map = new TreeMap<>();
        for (int i = 0; i < names.length; i++){
            map.put(heights[i], names[i]);
        }
        String res[] = new String[names.length];

        List<String> al = new ArrayList<>(map.values());
        Collections.reverse(al);

        for (int i = 0; i < al.size(); i++){
            res[i] = al.get(i);
        }
        return res;
    }
}