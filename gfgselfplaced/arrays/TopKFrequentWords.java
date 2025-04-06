package gfgselfplaced.arrays;
import java.util.*;
import java.util.stream.Collectors;

public class TopKFrequentWords {
    public static void main(String[] args) {
        System.out.println(
                topKFrequent(new String[]{"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"}, 4));

    }

    private static List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>();
        PriorityQueue<String> queue = new PriorityQueue<>();
        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }
//        return map.entrySet()
//                .stream()
//                .sorted(Comparator
//                        .comparing(Map.Entry<String, Integer>::getValue, Comparator.reverseOrder())
//                        .thenComparing(Map.Entry::getKey)) // break ties with key
//                .limit(k)
//                .map(Map.Entry::getKey)
//                .collect(Collectors.toList());
//    }
        return null;
    }
}
