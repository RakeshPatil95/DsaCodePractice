package gfgselfplaced.hashing;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSeq {
    public static void main(String[] args) {
        System.out.println(
                longestConsecutiveSeq(new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1}));
    }

    private static int longestConsecutiveSeq(int[] arr) {
        int result = 0;
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        for (int num : arr) {
            if (!set.contains(num - 1)) {
                int strick = 1;
                while (set.contains(num + 1)) {
                    strick++;
                    num++;
                }
                result = Math.max(result, strick);
            }
        }

        return result;
    }
}
