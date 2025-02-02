class Solution {
    public int findTheWinner(int n, int k) {
        List<Integer> al = new ArrayList<>();
        for (int i = 1; i <= n; i++){
            al.add(i);
        }
        int ind = 0;
        while (al.size() != 1){
            int rem = (ind + k - 1) % al.size();
            al.remove(rem);
            ind = rem;
        }
        return al.get(0);
    }
}