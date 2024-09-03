package Coding;

import java.util.HashMap;
import java.util.Map;

public class BinarySubarrayWithSum {
    public static void main(String[] args) {
        System.out.println(binarySubarrayWithSum(new int[]{1, 0, 1, 0, 1}, 2));
    }

    private static int binarySubarrayWithSum(int[] arr, int goal) {
        Map<Integer, Integer> prefixSumCount = new HashMap<>();
        prefixSumCount.put(0, 1);  // Initialize with 0 sum having one occurrence
        int sum = 0;
        int count = 0;

        for (int num : arr) {
            sum += num;
            if (prefixSumCount.containsKey(sum - goal)) {
                count += prefixSumCount.get(sum - goal);
            }
            prefixSumCount.put(sum, prefixSumCount.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}

