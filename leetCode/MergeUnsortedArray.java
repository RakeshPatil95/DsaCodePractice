package leetCode;

public class MergeUnsortedArray {
    public static void main(String[] args) {
        int [] arr1 = new int[] {1,2,3,3,5,6};
        int [] arr2 = new int[] {2,5,6};
        // i 2 1
        // j 2 1 0
        // k 5 4 3 2
        int i =arr1.length-arr2.length-1;
        int j = arr2.length-1;
        int k = arr1.length-1;

        while(i >= 0 && j >= 0) {
            if(arr1[i] >= arr2[j]) {
                arr1[k] = arr1[i];
                i--;
                k--;
            }else if(arr1[i] < arr2[j]){
                arr1[k] = arr2[j];
                j--;
                k--;
            }
        }
        for(int x : arr1) System.out.print(x + " ");
    }

}

