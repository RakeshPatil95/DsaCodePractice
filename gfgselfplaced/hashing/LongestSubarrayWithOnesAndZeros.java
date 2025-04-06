package gfgselfplaced.hashing;

import java.util.HashMap;
import java.util.Map;

public class LongestSubarrayWithOnesAndZeros {
    public static void main(String[] args) {
        System.out.println(longestSubarrayWithOnesAndZeros(new int[]{1, 0, 1, 1, 1, 0, 0}));
    }

    private static int longestSubarrayWithOnesAndZeros(int[] arr) {
        int result = 0;
        int currSum = 0;
        Map map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = -1;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            map.put(currSum, i);
            currSum += arr[i];
            if (currSum == 0) {
                return i + 1;
            }
            if (map.containsKey(currSum)) {
                result = Math.max(result, i - (Integer) map.get(currSum));
            }
        }
        return result;
    }
}
