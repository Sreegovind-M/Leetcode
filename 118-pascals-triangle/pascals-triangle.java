class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> res = new ArrayList<>();
        
        if (n == 0) {
            return res;
        }
        List<Integer> al = new ArrayList<>();
        al.add(1);
        res.add(new ArrayList<>(al));

        if (n == 1) return res;

        al.add(1);
        res.add(new ArrayList<>(al));

        if (n == 2) return res;

        for (int i = 2; i < n; i++) {
            al = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    al.add(1);
                }
                else {
                    int num = res.get(i - 1).get(j - 1) + res.get(i - 1).get(j);
                    System.out.println(num);
                    al.add(num);
                }
            }
            res.add(al);
        }

        // System.out.println(res.get(1).get(1));
        return res;
    }
}