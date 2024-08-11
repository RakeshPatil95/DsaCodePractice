package gfgselfplaced.arrays;

import java.util.Arrays;

public class MejorityElement {
    public static void main(String[] args) {
        int arr[] = {6, 1, 15, 19, 9, 13, 12, 6, 7, 2, 10, 4, 1, 14, 11, 14, 14, 13};
        int arr1[] = {1, 1, 1, 1, 1, 0, 0, 0};
    //    System.out.println(majorityElement(arr, arr.length));
        System.out.println(countOnes(arr1, arr1.length));

    }

    static int majorityElement(int a[], int size) {
        Arrays.sort(a);
        int count = 0;
        for (int i = 0; i < size; i++) {
            count++;
            if (i == size - 1) {
                count++;
            } else {
                if (a[i] != a[i + 1]) {
                    if (count > (size / 2)) {
                        return a[i];
                    }
                }
            }
            count=0;
        }
        return -1;
    }

    public static int countOnes(int arr[], int N) {
        int left = 0;
        int right = N - 1;
        int idx = 0;
        while (left <= right) {
            int mid = ((left + right) / 2);
            if (arr[mid] == 1) {
                if (mid == N - 1) {
                    return 1;
                } else {
                    if (arr[mid + 1] == 0) {
                        idx = mid;
                        break;
                    } else {
                        left = mid + 1;
                    }
                }
            } else {
                if (mid == N - 1) {
                    return 0;
                } else {
                    if (arr[mid - 1] == 0) {
                        right = mid - 1;
                    } else {
                        idx = mid - 1;
                        break;
                    }
                }
            }
        }
        return idx + 1;
    }
}
