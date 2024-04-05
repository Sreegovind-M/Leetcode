class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int count = 0;
        for (String a : operations){
            if (a.contains("-")){
                count--;
            }else {
                count++;
            }
        }
        return count;
    }
}