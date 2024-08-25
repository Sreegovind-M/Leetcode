class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int arr[] = candies.clone();
        Arrays.sort(arr);

        int maxi = arr[arr.length - 1];

        ArrayList<Boolean> res = new ArrayList<>();
        for (int i = 0; i < candies.length; i++){
            if (candies[i] + extraCandies >= maxi){
                res.add(true);
            }
            else {
                res.add(false);
            }
        }
        return res;
    }
}