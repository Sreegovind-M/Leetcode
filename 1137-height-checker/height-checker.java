class Solution {
    public int heightChecker(int[] heights) {
        int arr[] = heights.clone();

        Arrays.sort(arr);
        int count = 0;

        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < heights.length; i++){
            if (arr[i] != heights[i]){
                count++;
            }
        }
        return count;
    }
}