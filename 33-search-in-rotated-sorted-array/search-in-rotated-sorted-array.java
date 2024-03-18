class Solution {
    public int search(int[] nums, int target) {
        return binary_search(nums, 0, nums.length - 1, nums.length, target);
    }
    public int binary_search(int nums[], int start, int end, int n, int tar){
        while (start <= end){
            int mid = (start + end) / 2;

            if (nums[mid] == tar){
                return mid;
            }
            if (nums[start] <= nums[mid]){
                if (nums[start] <= tar && tar < nums[mid]){
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
            else {
                if (nums[mid] < tar && tar <= nums[end]){
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}