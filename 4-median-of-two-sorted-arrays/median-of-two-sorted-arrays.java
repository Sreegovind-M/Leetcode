class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();

        DecimalFormat df = new DecimalFormat("0.00000");

        for (int i = 0; i < nums1.length; i++){
            list.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++){
            list.add(nums2[i]);
        }

        Collections.sort(list);

        int n = list.size();

        double x =(double) list.get(n / 2);
        if (n % 2 == 0){
            double y = (double)list.get(n / 2 - 1);

            return ((double)(x + y) / 2.0);
        }

        return (double)x;
    }
}