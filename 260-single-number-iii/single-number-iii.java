class Solution {
    public int[] singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        List<Integer> al = new ArrayList<>();
        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            int occ = entry.getValue();

            if (occ == 1){
                al.add(entry.getKey());
            }
        }

        int arr[] = new int[al.size()];
        for (int i = 0; i < al.size(); i++){
            arr[i] = al.get(i);
        }
        return arr;
    }
}