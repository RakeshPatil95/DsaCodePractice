package gfgselfplaced.hashing;

import java.util.HashSet;
import java.util.Set;

public class SubarrayWithZeroSum {
    public static void main(String[] args) {
        System.out.println(subarrayWithZeroSum(new int[]{1, 4, 3, 2, -1, -1, 4, 1}));
        System.out.println(subarrayWithZeroSum(new int[]{-3, 4, -3, -1, 1}));
        System.out.println(subarrayWithZeroSum(new int[]{-3, 2, 1}));
    }

    private static boolean subarrayWithZeroSum(int[] arr) {
        int currSum = arr[0];
        Set set = new HashSet<>();
        for (int i = 1; i < arr.length; i++) {
            if (set.contains(currSum)) {
                return true;
            } else {
                set.add(currSum);
                currSum += arr[i];
            }
            if (currSum == 0) {
                return true;
            }
        }
        return false;
    }
}
