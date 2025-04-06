package gfgselfplaced.arrays;

public class ConsecativeEvenOddElementOFArray {
    public static void main(String[] args) {
        System.out.println(maxEvenOdd(new int[]{10, 12, 14, 7, 8}));
    }

    // arr[]: input array
    // n: size of array
    //Function to find the length of longest subarray of even and odd numbers.
    public static int maxEvenOdd(int arr[]) {
        int count = 1;
        int res = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (((arr[i] % 2 == 0 && arr[i - 1] % 2 != 0) || (arr[i]%2 != 0 && arr[i - 1] % 2 == 0))) {
                count++;
            }
            res = Math.max(res, count);
        }
        return res;
        // your code here
    }
}
