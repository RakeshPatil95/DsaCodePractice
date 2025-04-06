package gfgselfplaced.hashing;

import java.util.*;

public class FrequenciesInArray {
    public static void main(String[] args) {
        frequenciesInArray(new int[]{10, 20, 10, 20, 30, 50, 70, 70, 70, 70});
    }

    private static void frequenciesInArray(int[] arr) {
        LinkedHashMap<Integer, Integer> hashmap = new LinkedHashMap<>();
        for (int i : arr) {
            hashmap.put(i, hashmap.getOrDefault(i, 0) + 1);
        }
        System.out.println(hashmap);
    }

//    private static void frequenciesInArray(int[] arr) {
//        int count;
//        for (int i = 0; i < arr.length; i++) {
//            count = 0;
//            boolean flag = false;
//            for (int j = 0; j < i; j++) {
//                if (arr[j] == arr[i]) {
//                    flag = true;
//                    break;
//                }
//            }
//            if (flag) {
//                continue;
//            }
//            for (int k = i; k < arr.length; k++) {
//                if (arr[k] == arr[i]) {
//                    count++;
//                }
//            }
//            System.out.println(arr[i] + " " + count);
//        }
//    }


}
