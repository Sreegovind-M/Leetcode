class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum = 0;
        if(num == 0 || num==1) return false;
        for(int fact = 2; fact * fact < num; fact++)
            if(num%fact ==0 )
                sum += fact + num/fact;
        return num == (sum + 1);
    }
}