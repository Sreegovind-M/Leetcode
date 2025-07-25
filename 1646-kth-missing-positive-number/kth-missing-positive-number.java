class Solution {
    public int findKthPositive(int[] arr, int k) {
        int l = 0;
        int r = arr.length - 1;

        while (l <= r) {
            int mid = (l + r) / 2;

            int mis = arr[mid] - (mid + 1);
            if (mis < k) {
                l = mid + 1;
            }
            else {
                r = mid - 1;
            }
        }
        return r + k + 1;
    }
}