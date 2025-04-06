package gfgselfplaced.hashing;

import java.util.*;

public class GroupAnagram {
    public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
    }

    private static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] chr = s.toCharArray();
            Arrays.sort(chr);
            String sout = String.valueOf(chr);
            map.computeIfAbsent(sout, k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
