class Solution {
    public String largestNumber(int[] nums) {
        int n = nums.length;
        String arr[] = new String[n];
        
        for (int i = 0; i < n; i++){
            arr[i] = String.valueOf(nums[i]);
        }

        Comparator<String> comp = new Comparator<>(){
            public int compare(String s1, String s2){
                String a = s1 + s2;
                String b = s2 + s1;

                return b.compareTo(a);
            }
        };

        Arrays.sort(arr, comp);

        if (arr[0].charAt(0) == '0'){
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        for (String s : arr){
            sb.append(s);
        }

        return sb.toString();
    }
}