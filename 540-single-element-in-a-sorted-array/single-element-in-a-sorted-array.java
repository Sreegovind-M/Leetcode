class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;

        if (n == 1){
            return nums[0];
        }

        if (nums[0] != nums[1]){
            return nums[0];
        }
        if (nums[n - 1] != nums[n - 2]){
            return nums[n - 1];
        }

        int low = 2;
        int high = n - 3;

        while (low <= high){
            int mid = low + (high - low) / 2;
            // Base case if we found out the unique element
            if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]){
                return nums[mid];
            }
            // To iterate the first occurence of duplicate elements
            if (nums[mid] != nums[mid + 1]){
                mid--;
            }

            // If the mid ind is even we cut out the left side and check in right side
            if (mid % 2 == 0){
                low = mid + 2;
                // we add mid + 2 because the mid is on the first occurence of duplicate element
            }
            else {
                high = mid - 1;
            }
        }
        return -1;
    }
}