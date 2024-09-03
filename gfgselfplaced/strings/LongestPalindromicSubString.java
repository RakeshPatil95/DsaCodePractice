package Coding;

public class LongestPalindromicSubString {
    public static void main(String[] args) {
        System.out.println(longestPalindromicSubString("cbbd"));
        System.out.println(longestPalindromicSubString("babad"));

    }

    //    private static String longestPalindromicSubString(String str) {
//        String result = "";
//        if (str.length() == 1) {
//            return str;
//        }
//        for (int i = 0; i < str.length(); i++) {
//            for (int j = i; j < str.length(); j++) {
//                if (checkPalindrome(i, j, str)) {
//                    if (result.length() < (j - i + 1)) {
//                        result = str.substring(i, j + 1);
//                    }
//                }
//            }
//        }
//        return result;
//    }
//
//    private static boolean checkPalindrome(int start, int end, String str) {
//        while (end >= start) {
//            if (str.charAt(start) != str.charAt(end)) {
//                return false;
//            }
//            end--;
//            start++;
//        }
//        return true;
//    }
    private static String longestPalindromicSubString(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }

        // Transform the string with '#' in between each character and at the ends
        String transformedStr = preprocess(str);
        int n = transformedStr.length();
        int[] palindromeLengths = new int[n];
        int center = 0, right = 0;

        for (int i = 0; i < n; i++) {
            int mirror = 2 * center - i;

            if (i < right) {
                palindromeLengths[i] = Math.min(right - i, palindromeLengths[mirror]);
            }

            // Expand around the current center i
            int a = i + (1 + palindromeLengths[i]);
            int b = i - (1 + palindromeLengths[i]);

            while (a < n && b >= 0 && transformedStr.charAt(a) == transformedStr.charAt(b)) {
                palindromeLengths[i]++;
                a++;
                b--;
            }

            // Update center and right
            if (i + palindromeLengths[i] > right) {
                center = i;
                right = i + palindromeLengths[i];
            }
        }

        // Find the maximum element in palindromeLengths
        int maxLen = 0;
        int centerIndex = 0;
        for (int i = 0; i < n; i++) {
            if (palindromeLengths[i] > maxLen) {
                maxLen = palindromeLengths[i];
                centerIndex = i;
            }
        }

        // Extract the longest palindrome
        int start = (centerIndex - maxLen) / 2;
        return str.substring(start, start + maxLen);
    }

    private static String preprocess(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append('#');
        for (char c : str.toCharArray()) {
            sb.append(c);
            sb.append('#');
        }
        return sb.toString();
    }

}
