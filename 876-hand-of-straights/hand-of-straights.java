class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        int n = hand.length;
        if (n % groupSize != 0) {
            return false;
        }
        Arrays.sort(hand);

        for (int i = 0; i < n; i++) {
            if (hand[i] >= 0) {
                if (!find(hand, i, groupSize, n)) {
                    return false;
                }
            }
        }
        return true;
    }
    public boolean find(int hand[], int i, int size, int n) {
        int count = 1;
        int next = hand[i] + 1;
        i++;

        while (i < n && count < size) {
            if (hand[i] == next) {
                next = hand[i] + 1;
                hand[i] = -1;
                count++;
            }
            i++;
        }
        return count == size;
    }
}