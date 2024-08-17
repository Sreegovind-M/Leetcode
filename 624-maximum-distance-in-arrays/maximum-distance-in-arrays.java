class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int maxi = arrays.get(0).get(arrays.get(0).size() - 1);
        int mini = arrays.get(0).get(0);

        int dist = 0;

        for (int i = 1; i < arrays.size(); i++){
            ArrayList<Integer> al = new ArrayList<>(arrays.get(i));
            int n = al.size();
            dist = Math.max(dist, Math.abs(al.get(n - 1) - mini));
            dist = Math.max(dist, Math.abs(maxi - al.get(0)));
            mini = Math.min(mini, al.get(0));
            maxi = Math.max(maxi, al.get(n - 1));
        }
        System.out.println(maxi + " " + mini);
        
        return Math.abs(dist);
    }
}