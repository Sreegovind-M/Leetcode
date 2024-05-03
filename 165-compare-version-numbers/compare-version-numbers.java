class Solution {
    public int compareVersion(String version1, String version2) {
        String arr1[] = version1.split("\\.");
        String arr2[] = version2.split("\\.");

        for (int i = 0; i < Math.max(arr1.length, arr2.length); i++){
            Integer n1 = i < arr1.length ? Integer.parseInt(arr1[i]) : 0;
            Integer n2 = i < arr2.length ? Integer.parseInt(arr2[i]) : 0;

            if (n1.compareTo(n2) != 0){
                return n1.compareTo(n2);
            }
        }
        return 0;
    }
}