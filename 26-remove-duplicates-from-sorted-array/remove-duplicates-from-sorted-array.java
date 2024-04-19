class Solution {
    public int removeDuplicates(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();

        for (int i : nums){
            set.add(i);
        }
        Iterator iterate = set.iterator();
        int i = 0;
        while (iterate.hasNext()){
            nums[i++] = (int)(iterate.next());
        }
        return set.size();
    }
}