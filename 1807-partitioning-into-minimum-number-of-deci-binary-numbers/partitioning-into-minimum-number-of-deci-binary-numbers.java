class Solution {
    public int minPartitions(String n) {
        char num = '0';
        for (char c : n.toCharArray()){
            if (c > num){
                num = c;
            }
        }
        return num - '0';
    }
}