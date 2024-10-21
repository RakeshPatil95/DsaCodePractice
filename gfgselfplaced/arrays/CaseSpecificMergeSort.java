package gfgselfplaced.arrays;
public class CaseSpecificMergeSort {

    public static void main(String[] args) {
        String input = "defRTSersUXI";
        String result = caseSpecificSort(input);
        System.out.println(result); // Expected output: deeIRSfrsTUX
    }

    public static String caseSpecificSort(String s) {
        char[] arr = s.toCharArray();
        mergeSort(arr, 0, arr.length - 1);
        return new String(arr);
    }

    private static void mergeSort(char[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    private static void merge(char[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        char[] leftArr = new char[n1];
        char[] rightArr = new char[n2];

        for (int i = 0; i < n1; ++i)
            leftArr[i] = arr[left + i];
        for (int i = 0; i < n2; ++i)
            rightArr[i] = arr[mid + 1 + i];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (Character.toLowerCase(leftArr[i]) <= Character.toLowerCase(rightArr[j])) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }
}
