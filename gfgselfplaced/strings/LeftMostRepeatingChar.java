package gfgselfplaced.strings;

import java.util.Arrays;

public class LeftMostRepeatingChar {
    public static void main(String[] args) {
        String str = "abccbd";
        String str1 = "abcd";
        String str3 = "1abc23";
        System.out.println(leftMostRepeatingChar(str));
        System.out.println(leftMostRepeatingCharUsingBoolArray(str1));
        System.out.println(findSum(str3));
    }

    private static int leftMostRepeatingCharUsingBoolArray(String str1) {
        boolean[] visited = new boolean[256];
        int result = Integer.MAX_VALUE;
        for (int i = str1.length() - 1; i > 0; i--) {
            if (visited[str1.charAt(i)]) {
                result = Math.min(result, i);
            } else {
                visited[str1.charAt(i)] = true;
            }
        }
        return result == Integer.MAX_VALUE ? -1 : result;
    }

    private static int leftMostRepeatingChar(String str) {
        int arr[] = new int[256];
        Arrays.fill(arr, -1);
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < str.length(); i++) {
            int idx = arr[str.charAt(i)];
            if (idx == -1) {
                arr[str.charAt(i)] = i;
            } else {
                result = Math.min(result, idx);
            }
        }
        return result == Integer.MAX_VALUE ? -1 : result;
    }

    public static long findSum(String str) {
        String[] arr = str.split("[A-Za-z]");
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].equals(""))
                sum += Integer.parseInt(arr[i]);
        }
        return sum;

    }
}
