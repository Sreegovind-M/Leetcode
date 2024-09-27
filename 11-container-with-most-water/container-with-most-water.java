class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int maxi = Math.min(height[l], height[r]);
        while (l < r){
            int area = Math.min(height[l], height[r]) * (r - l);
            maxi = Math.max(area, maxi);
            if (height[r] > height[l]){
                l++;
            }
            else {
                r--;
            }
        }
        return maxi;
    }
}