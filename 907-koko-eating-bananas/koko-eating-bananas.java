class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int low = 1;
        int high = piles[piles.length - 1];
        int res = high;
        while (low < high) {
            int mid = (low + high) / 2;

            if (check(piles, h, mid) == true) {
                high = mid;
            }
            else {
                low = mid + 1;
            }
        }
        return low;
    }
    public boolean check(int piles[], int h, int num) {
        for (int i = 0; i < piles.length; i++) {
            double quo = ((double)piles[i] / num);
            if (quo < 1) {
                h--;
            }
            else {
                h -= (Math.ceil(quo));
            }

            if (h < 0) {
                return false;
            }
        }
        return h >= 0;
    }
}