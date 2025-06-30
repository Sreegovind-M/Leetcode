class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);

        int n = piles.length;
        int x = 1;
        int y = piles[n - 1];
        while (x <= y) {
            int mid = x + (y - x) / 2;

            if (find(mid, piles, h)) {
                y = mid - 1;
            }
            else {
                x = mid + 1;
            }
        }
        return x;
    }
    public boolean find(int num, int[] piles, int h) {
        
        for (int i = 0; i < piles.length; i++) {
            double quo = ((double)piles[i] / num);
            if (quo < 1) {
                h--;
            }
            else {
                h -= Math.ceil(quo);
            }
            if (h < 0) {
                return false;
            }
        }
        return true;
    }
}