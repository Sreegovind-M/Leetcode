class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);

        int count = 0;
        
        int left = 0;
        int right = people.length - 1;

        while (left <= right){
            if (people[right] == limit){
                right--;
                count++;
            }
            else {
                int add = people[left] + people[right];

                if (add == limit){
                    count++;
                    left++;
                    right--;
                }
                else if (add > limit){
                    right--;
                    count++;
                }
                else {
                    left++;
                    right--;
                    count++;
                }
            }
            if (left == right && people[right] <= limit){
                count++;
                return count;
            }
        }

        return count;
    }
}