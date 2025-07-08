class Solution {
    public int findKthPositive(int[] arr, int k) {
        int count = 0;

        int num = 1;
        int i = 0;
        while (true) {
            if (i < arr.length && arr[i] == num) {
                i++;
            }
            else {
                count++;
            }
            if (count == k) {
                break;
            }
            num++;
        }
        return num;
    }
}