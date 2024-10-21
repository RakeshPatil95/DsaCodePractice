package gfgselfplaced.arrays;

public class ThreePartitionWithEqualSum {
    public static void main(String[] args) {
        System.out.println(threePartitionWithEqualSum(new int[]{5, 2, 6, 1, 1, 1, 1, 4}));
        System.out.println(threePartitionWithEqualSum(new int[]{3, 2, 5, 1, 1, 5}));
        System.out.println(threePartitionWithEqualSum(new int[]{0, 0, 0, 0}));
        System.out.println(threePartitionWithEqualSum(new int[]{1, -1, 1, -1}));
        System.out.println(threePartitionWithEqualSum(new int[]{10,-10,10,-10,10,-10,10,-10}));
    }

    private static boolean threePartitionWithEqualSum(int[] arr) {
        int sum = 0;
        int prefixSum = 0;

        for (int k : arr) {
            sum += k;
        }
        int targetSum = sum / 3;
        int count = 0;
        if (sum % 3 != 0) return false;
        for (int j : arr) {
            prefixSum += j;
            if (prefixSum == targetSum) {
                count++;
                prefixSum = 0;
            }
        }
        return count >= 3;
    }
}
