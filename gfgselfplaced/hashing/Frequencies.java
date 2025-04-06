package gfgselfplaced.hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Frequencies {
    public static void main(String[] args) {
        frequencyCount(new int[]{2, 3, 2, 3, 5}, 5, 5);
    }

    public static void frequencyCount(int arr[], int N, int P) {
        // do modify in the given array
        Map<Integer, Integer> s = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > P) continue;
            if (s.containsKey(arr[i])) {
                s.put(arr[i], s.get(arr[i]) + 1);
            } else {
                s.put(arr[i], 1);
            }
        }
        for (int i = 0; i < N; i++) {
          if(s.containsKey(i+1)) {
              arr[i] = s.get(i+1);
          }else{
              arr[i] = 0;
          }
        }
    }
}
