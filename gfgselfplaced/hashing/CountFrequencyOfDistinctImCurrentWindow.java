package gfgselfplaced.hashing;

import java.util.HashMap;
import java.util.Map;

public class CountFrequencyOfDistinctImCurrentWindow {
    public static void main(String[] args) {
        countFrequencyOfDistinctImCurrentWindow(new int[]{10, 20, 10, 10, 30, 40}, 4);
    }

    private static void countFrequencyOfDistinctImCurrentWindow(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < k; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i])+1);
            } else {
                map.put(arr[i], 1);
            }
        }
        System.out.print(map.size()+" ");
        for (int i = k; i < arr.length; i++) {
            map.put(arr[i-k], map.get(arr[i-k])-1);
            if(map.get(arr[i-k]) == 0){
                map.remove(arr[i-k]);
            }
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }else {
                map.put(arr[i], 1);
            }
            System.out.print(map.size()+" ");
        }
    }
}
