package leetCode;

import java.util.Arrays;

class FrequencyOfTheMostFrequentElement {
    public static void main(String[] args) {
        System.out.println(FrequencyOfMostFrequentElement(new int[]{14,4,8,1}, 5));
    }

    private static int FrequencyOfMostFrequentElement(int[] nums, int k) {
        Arrays.sort(nums);
        // 1,4,8,14
        int result = 1;
        for (int i = nums.length-1; i >= 0; i--) {
            int count = k;
            int frequency = 1;
            for (int j = i - 1; j >= 0; j--) {
                if (nums[i] - nums[j] <= count) {
                    frequency++;
                    count = count - (nums[i] - nums[j]);
                }
                result = Math.max(result, frequency);
            }
        }
        return result;
    }
}