class Solution {
    public int[] searchRange(int[] arr, int target) {
        int n = arr.length;

        if (n == 0) {
            return new int[] {-1, -1};
        }  

        int left = bs(arr, n, target, true);
        int right = bs(arr, n, target, false); 

        return new int[] {left, right};
    }
    public int bs(int arr[], int n, int target, boolean isLeft){
        int l = 0;
        int r = n - 1;
        int ind = -1;
        while (l <= r){
            int mid = (l + r) / 2;

            if (arr[mid] == target){
                ind = mid;
                if (isLeft){
                    r = mid - 1;
                }
                else {
                    l = mid + 1;
                }
            }
            else if (arr[mid] > target){
                r = mid - 1;
            }
            else {
                l = mid + 1;
            }
        }
        return ind;
    }
}