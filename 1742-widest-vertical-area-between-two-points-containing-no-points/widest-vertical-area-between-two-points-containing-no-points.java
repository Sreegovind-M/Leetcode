class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        Arrays.sort(points, (p1, p2)->(p1[0] - p2[0]));
        int maxi = 0;
        for (int i = 0; i < points.length - 1; i++){
            
                int t = points[i + 1][0] - points[i][0];

                if (t > maxi){
                    maxi = t;
                }
        
        }
        return maxi;
    }
}