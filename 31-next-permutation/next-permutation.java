class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int breakThroughPoint = -1;

        for (int i = n - 2; i >= 0; i--){
            if (nums[i] < nums[i + 1]){
                breakThroughPoint = i;
                break;
            }
        }

        if (breakThroughPoint == -1){
            reverse(nums, 0, n - 1);
            return;
        }

        for (int i = n - 1; i > breakThroughPoint; i--){
            if (nums[i] > nums[breakThroughPoint]){
                int temp = nums[i];
                nums[i] = nums[breakThroughPoint];
                nums[breakThroughPoint] = temp;
                break;
            }
        }
        reverse(nums, breakThroughPoint + 1, n - 1);
    }
    public void reverse(int arr[], int s, int e){
        while (s < e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }
}