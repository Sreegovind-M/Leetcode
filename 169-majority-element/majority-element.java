class Solution {
    public int majorityElement(int[] nums) {
        // Moore Voting Algorithm
        int ele = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++){
            if (count == 0){
                ele = nums[i];
                count = 1;
            }
            else if (ele == nums[i]){
                count++;
            }
            else {
                count--;
            }
        }
        return ele;
    }
}