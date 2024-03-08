class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int maxi = 0;
        for (int i : map.values()){
            maxi = Math.max(i, maxi);
        }
        int count = 0;
        for (int i : map.values()){
            if(maxi == i){
                count += i;
            }
        }
        return count;
    }
}