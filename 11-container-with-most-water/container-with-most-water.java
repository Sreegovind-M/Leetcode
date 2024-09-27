class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int l = 0;
        int r = n - 1;

        int res = 0;
        while (l < r){
            int area = Math.min(height[l], height[r]) * (r - l);
            res = Math.max(res, area);
            if (height[l] < height[r]){
                l++;
            }
            else {
                r--;
            }
        }
        return res;
    }
}