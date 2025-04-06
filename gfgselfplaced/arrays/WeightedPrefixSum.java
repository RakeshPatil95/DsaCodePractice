package gfgselfplaced.arrays;

public class WeightedPrefixSum {
    int a;
    static String name;
    public static int getSumW(int[] wPrefixSum, int[] prefixSum, int l, int r) {
        int b;
        WeightedPrefixSum s = new WeightedPrefixSum();
        WeightedPrefixSum.name = "sdfsdf";
        s.a = 10;
        if (l == 0) {
            b=10;
            return wPrefixSum[r] + prefixSum[r];
        }
        return (wPrefixSum[r] - wPrefixSum[l - 1]) - ((l - 1) * (prefixSum[r] - prefixSum[l - 1]));
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 4, 6, 1};
        int n = arr.length;
        int[] wPrefixSum = new int[n];
        int[] prefixSum = new int[n];
        wPrefixSum[0] = 0;
        prefixSum[0] = arr[0];

        for (int i = 1; i < n; i++) {
            wPrefixSum[i] = wPrefixSum[i - 1] + (i * arr[i]);
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }

        System.out.println(getSumW(wPrefixSum, prefixSum, 0, 2)); // Should print 23
        System.out.println(getSumW(wPrefixSum, prefixSum, 2, 3)); // Should print 13
    }
}

