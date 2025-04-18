package gfgselfplaced.hashing;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public static void main(String[] args) {
        System.out.println(isomorphicStrings("egg", "add"));
        System.out.println(isomorphicStrings("foo", "bar"));
        System.out.println(isomorphicStrings("paper", "title"));
        System.out.println(isomorphicStrings("badc", "baba"));
    }

    private static boolean isomorphicStrings(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        if (s.length() != t.length()) return false;
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                if (map.get(s.charAt(i)) != t.charAt(i)) {
                    return false;
                }
            } else {
                if(map.containsValue(t.charAt(i)))  return false;
                map.put(s.charAt(i), t.charAt(i));
            }
        }
        return true;
    }
}
