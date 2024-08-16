package gfgselfplaced.arrays;

import java.util.Arrays;

public class EquilibriumIndexOfAnArray {
    public static void main(String[] args) {
        System.out.println(equilibriumIndexOfAnArray(new int[]{-7, 1, 5, 2, -4, 3, 0}));
        System.out.println(equilibriumIndexOfAnArray(new int[]{1, 2, 3, 4, 5, 6, 4}));
    }

    private static int equilibriumIndexOfAnArray(int[] arr) {
        int sum = Arrays.stream(arr).sum();
        int leftSum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum -= arr[i];
            if (sum == leftSum) {
                return i;
            }
            leftSum += arr[i];
        }
        return 404;
    }
}
