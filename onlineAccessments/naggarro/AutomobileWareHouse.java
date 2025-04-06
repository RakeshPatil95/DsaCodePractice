package onlineAccessments.naggarro;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class AutomobileWareHouse {
    public static void main(String[] args) {
        System.out.println(
        automobileWareHouse(new int[]{4,6,3,3,4},new int[]{-1,10,10,15,-5}));
        System.out.println(
                automobileWareHouse(new int[]{1,2,1},new int[]{10,20,30}));
    }

    private static int automobileWareHouse(int[] proId, int[] price) {
        Map<Integer,Integer> map = new HashMap<>();
        int prev = 0;
        for (int i = 0; i < proId.length; i++) {
            if(price[i] > 0 ) {
                if (map.containsKey(proId[i])) {
                    if(proId[prev] == proId[i]) {
                        map.put(proId[i], Math.max(map.get(proId[i]), price[i]));
                    }else {
                    map.put(proId[i], map.get(proId[i])+price[i]);
                    }
                } else {
                    map.put(proId[i],price[i]);
                }
                prev++;

            }
        }

        return map.values()
                .stream()
                .mapToInt(Integer::intValue)
                .sum();
    }
}
