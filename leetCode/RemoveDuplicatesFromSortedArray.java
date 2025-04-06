package leetCode;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        System.out.println(removeDuplicatesFromSortedArray(new int[]{0, 0, 1, 1, 1, 1, 2, 2, 2, 3})); // Expected output: 4
        System.out.println(removeDuplicatesFromSortedArray(new int[]{1, 1, 1, 2, 2, 3})); // Expected output: 3

        // Best Test Case
        System.out.println(removeDuplicatesFromSortedArray(new int[]{1, 2, 3, 4, 5})); // Expected output: 5

        // Worst Test Case
        System.out.println(removeDuplicatesFromSortedArray(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1})); // Expected output: 2
    }

    private static int removeDuplicatesFromSortedArray(int[] arr) {
        int i = 0;
        for (int n : arr) {
            if (i < 2 || n != arr[i - 2]) {
                arr[i++] = n;
            }
        }
        return i;
    }
}
