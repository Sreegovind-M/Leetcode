class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> al = new ArrayList<>();
        for (int i = left; i <= right; i++){
            if (find(i) == true){
                al.add(i);
            }
        }
        return al;
    }
    public boolean find(int num){
        int temp = num;
        while (temp != 0){
            int rem = temp % 10;
            if (rem == 0) return false;
            if (num % rem != 0) return false;
            temp /= 10;
        }
        return true;
    }
}