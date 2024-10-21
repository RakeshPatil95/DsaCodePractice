package gfgselfplaced.arrays;

public class ContiguousSubArrayWithMaxSum {
    public static void main(String[] args) {
        System.out.println(contiguousSubArrayWithMaxSum(new int[]{1, 2, 3, -2, 5}));
        System.out.println(contiguousSubArrayWithMaxSum(new int[]{-1,-2,-3,-4,-5}));
    }

    private static int contiguousSubArrayWithMaxSum(int[] arr) {
        int currentMax =0;
        int maxSum = Integer.MIN_VALUE;

        for (int num : arr) {
            currentMax += num;
            maxSum = Math.max(maxSum, currentMax);
        }
        return maxSum;
    }
}
