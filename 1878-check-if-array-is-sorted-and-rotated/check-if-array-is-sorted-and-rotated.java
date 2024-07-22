class Solution {
    public boolean check(int[] nums) {
        List<Integer> al = new ArrayList<>();
        int n = nums.length;
        int j = 0;
    
        for(int i = 0; i < 2 * n; i++){
            al.add(nums[j]);
            if (j == n - 1){
                j = 0;
            }else j++;
        }
        Arrays.sort(nums);

        for (int i = 0; i < al.size() - n; i++){
            boolean check = true;
            int ind = 0;
            for (int k = i; k < i + n; k++){
                if (nums[ind++] != al.get(k)){
                    check = false;
                    break;
                }
            }
            if (check == true){
                return true;
            }
        }       
        System.out.println(al);  

        return false;
    }
}