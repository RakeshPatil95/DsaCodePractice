package gfgselfplaced.hashing;

import java.util.HashSet;
import java.util.Set;

public class SubArrayWithTargerSum {
    public static void main(String[] args) {
        System.out.println(subArrayWithTargerSum(new int[]{5, 8, 6, 13, 3, -1}, 22));
        System.out.println(subArrayWithTargerSum(new int[]{3, 2, 5, 6}, 10));
        System.out.println(subArrayWithTargerSum(new int[]{15, 2, 8, 10, -5, -8, 6}, 3));
        System.out.println(subArrayWithTargerSum(new int[]{4, 7, 9, 8, 7, 11, 10, 9}, 21));
    }

    private static boolean subArrayWithTargerSum(int[] arr, int target) {
        int currSum = arr[0];
        Set set = new HashSet<>();
        for (int i = 1; i < arr.length; i++) {
            set.add(currSum);
            currSum += arr[i];
            if (currSum == target) {
                return true;
            }
            if (set.contains(currSum - target)) {
                return true;
            }
        }
        return false;
    }
}

