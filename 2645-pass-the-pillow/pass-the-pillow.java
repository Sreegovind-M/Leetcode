class Solution {
    public int passThePillow(int n, int time) {
        n--;
        int round_no = time / n;
        int step = time % n;

        if (round_no % 2 == 0){
            return step + 1;
        }
        return (n - step) + 1;
    }
}