class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int x) {
        int n = flowerbed.length;
        if (x == 0)return true;

        if (n == 1) {
            if (flowerbed[0] == 0 && x == 1) return true;
            return false;
        }
        
        if (flowerbed[0] == 0 && flowerbed[1] == 0){
            flowerbed[0] = 1;
            x--;
        }
        
        if (flowerbed[n - 1] == 0 && flowerbed[n - 2] == 0){
            flowerbed[n - 1] = 1;
            x--;
        }
        
        for (int i = 1; i < n - 1; i++){
            if (x == 0) return true;
            if (flowerbed[i] == 0){
                if (flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
                    flowerbed[i] = 1;
                    x--;
                }
            }
        }
	
        if (x <= 0){
            return true;
        }
        return false;
    }
}