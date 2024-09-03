package Coding;

import java.util.HashMap;
import java.util.Map;

public class CheckSubarraySum {
    public static void main(String[] args) {
        checkSubarraySum(new int[]{23, 2, 4, 6, 7}, 6);
    }

    private static boolean checkSubarraySum(int[] arr, int k) {
        int prefixSum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            prefixSum+=arr[i];
            int rem = prefixSum%k;
            if(rem==0 && i>=1) return true;

            if(map.containsKey(rem)){
                int idx = map.get(rem);
                if((i-idx)>2) return true;
            }
            else {
                map.put(rem, i);
            }
        }

        return false;

    }
}
