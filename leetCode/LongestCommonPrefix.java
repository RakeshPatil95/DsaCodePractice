package leetCode;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        System.out.println(
                longestCommon(new String[]{"flower", "flow", "flight"}));
    }

    private static String longestCommon(String[] strs) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            for (int j = 0; j < strs.length; j++) {
                if (strs[j].charAt(i) != c) {
                    return sb.toString();
                }
            }
            sb.append(c);
        }
        return sb.toString();
    }
}
