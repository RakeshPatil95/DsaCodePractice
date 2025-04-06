package gfgselfplaced.arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 12, 11, 13, 5, 6 };
        insertionSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    private static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i-1;
            while(j>=0 && i!= arr.length-1){
                if(arr[j] > arr[i]){
                    arr[i]=arr[j];
                    i--;
                }else {
                    arr[j+1] = temp;
                }

                j--;
            }
        }
    }
}
