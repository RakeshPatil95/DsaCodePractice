package gfgselfplaced.arrays;

import java.util.Arrays;
import java.util.Collections;

public class    HIndex {
    public static void main(String[] args) {
        System.out.println(hIndex(new int[]{3,0,6,1,5}));
        System.out.println(hIndex(new int[]{1,3,1}));
    }

    private static int hIndex(int[] arr) {
        int result =0;
        int count;
        // Step 1: Convert int[] to Integer[]
        Integer[] arrInteger = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        // Step 2: Sort in reverse order
        Arrays.sort(arrInteger, Collections.reverseOrder());
        // Step 3: Convert Integer[] back to int[] (optional)
        arr = Arrays.stream(arrInteger).mapToInt(Integer::intValue).toArray();
        for (int i = 1; i <= arr.length; i++) {
            count=0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[j] >= i) {
                    count++;
                }
                if(count > i){
                    break;
                }else{
                    if(count == i){
                        result = Math.max(result,i);
                    }
                }
            }
        }
        return result;
    }
}
