class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> map = new TreeMap<>();

        for (int i : arr1){
            map.put(i, map.getOrDefault(i , 0) + 1);
        }

        int res[] = new int[arr1.length];
        int ind = 0;

        for (int i = 0; i < arr2.length; i++){
            int num = arr2[i];

            int occ = map.get(num);

            while (occ > 0){
                res[ind++] = num;
                occ--;
            }
            map.replace(num , 0);
        }

        for (var m : map.entrySet()){
            int k = m.getKey();
            int v = m.getValue();

            while (v > 0){
                res[ind++] = k;
                v--;
            }
        }

        return res;
    }
}