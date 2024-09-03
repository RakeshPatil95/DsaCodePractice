package Coding;

public class MinSubArrayLen {
    public static void main(String[] args) {
        System.out.println(minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3}));
        System.out.println(minSubArrayLen(11, new int[]{1, 1, 1, 1}));
        System.out.println(minSubArrayLen(4, new int[]{1, 4, 4}));

    }

    private static int minSubArrayLen(int target, int[] nums) {
        int j = 0;
        int minLength = Integer.MAX_VALUE;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            while (sum >= target) {
                minLength = Math.min(minLength, i - j + 1);
                sum -= nums[j];
                j++;
            }
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}
