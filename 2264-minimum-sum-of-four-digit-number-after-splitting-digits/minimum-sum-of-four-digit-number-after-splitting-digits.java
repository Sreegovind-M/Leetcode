class Solution {
    public int minimumSum(int num) {
        String val = String.valueOf(num);

        String arr[] = val.split("");

        Arrays.sort(arr);

        String n1 = arr[0] + arr[3];
        String n2 = arr[1] + arr[2];

        System.out.println(n1);
        System.out.println(n2);

        int num1 = Integer.parseInt(n1);
        int num2 = Integer.parseInt(n2);

        return num1 + num2;
    }
}