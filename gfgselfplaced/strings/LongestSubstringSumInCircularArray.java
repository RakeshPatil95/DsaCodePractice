package gfgselfplaced.strings;

public class LongestSubstringSumInCircularArray {
    //add main method
    public static void main(String[] args) {
        int arr[] = new int[]{8, -8, 9, -9, 10, -11, 12};
        System.out.println(maxSubarraySumCircular(arr));
    }

    private static int maxSubarraySumCircular(int[] arr) {
        int n = arr.length;
        int max_normal = kadane(arr);
        if (max_normal < 0) {
            return max_normal;
        }
        int arr_sum = 0;
        for (int i = 0; i < n; i++) {
            arr_sum += arr[i];
            arr[i] = -arr[i];
        }
        int max_circular = arr_sum + kadane(arr);
        if (max_circular > max_normal) {
            return max_circular;
        }
        return 0;
    }

    private static int kadane(int[] arr) {
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum < 0) {
                sum = 0;
            }
            max = Math.max(max, sum);
        }
        return max;
    }
}
