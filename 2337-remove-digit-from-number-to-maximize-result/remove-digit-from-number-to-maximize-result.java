class Solution {
    public String removeDigit(String number, char digit) {
        StringBuilder sb = new StringBuilder(number);
        StringBuilder maxi = new StringBuilder("-1");
        for (int i = 0; i < number.length(); i++){
            if (number.charAt(i) == digit){
                StringBuilder ans = new StringBuilder(sb.deleteCharAt(i));
                if (ans.compareTo(maxi) > 0){
                    maxi = ans;
                }

                sb.insert(i, digit);
            }
        }
        return maxi.toString();
    }
}