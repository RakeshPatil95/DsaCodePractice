package gfgselfplaced.arrays;

public class FirstUniqueCharInString {
    public static void main(String[] args) {
        System.out.println(firstUniqueCharInString("loveleetcode"));
    }

    private static int firstUniqueCharInString(String str) {
        int[] count = new int[26];
        for (char c : str.toCharArray()) {
            count[c - 'a']++;
        }
        for (int i = 0; i < str.length(); i++) {
            if (count[str.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}
