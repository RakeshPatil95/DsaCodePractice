package onlineAccessments.naggarro;

public class FundRaisingCampaign {
    public static void main(String[] args) {
        System.out.println(fundRaisingCampaign(8, new int[]{8, 0, 0, 0, 2, 2, 2, 2})); // Output: 3
    }

    private static int fundRaisingCampaign(int n, int[] arr) {
        int[] prefixSum = new int[n + 1];
        for (int i = 0; i < n; i++) {
            prefixSum[i + 1] = prefixSum[i] + arr[i];
        }
        return splitCount(arr, 0, n - 1, prefixSum);
    }

    private static int splitCount(int[] arr, int start, int end, int[] prefixSum) {
        if (start >= end) {
            return 0;
        }

        int totalSum = prefixSum[end + 1] - prefixSum[start];
        if (totalSum % 2 != 0) {
            return 0;
        }

        int halfSum = totalSum / 2;
        for (int i = start; i <= end; i++) {
            int currentSum = prefixSum[i + 1] - prefixSum[start];
            if (currentSum == halfSum) {
                return 1 + Math.max(
                        splitCount(arr, start, i, prefixSum),
                        splitCount(arr, i + 1, end, prefixSum)
                );
            }
        }
        return 0;
    }
}