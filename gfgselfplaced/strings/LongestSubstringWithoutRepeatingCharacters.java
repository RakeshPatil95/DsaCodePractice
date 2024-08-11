package gfgselfplaced.strings;

import java.util.Arrays;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
// Order of n3 complexity
        System.out.print(longestSubstringWithoutRepeatingCharacters("abac"));
        System.out.print(longestSubstringWithoutRepeatingCharacters("aaaa"));

    }

    private static int longestSubstringWithoutRepeatingCharacters(String str) {
        int result=1;
        for (int i = 0; i < str.length() ; i++) {
            for (int j = i+1; j < str.length(); j++) {
                if(isDestinct(str,i,j)){
                    result = Math.max(result, j-i+1);
                }
            }
        }

        return result;
    }

    private static boolean isDestinct(String str, int i, int j) {
        int arr[] = new int[256];
        Arrays.fill(arr,-1);
        for (int  k = i;  k <= j;  k++) {
            if(arr[str.charAt(k)] == -1){
                arr[str.charAt(k)] = str.charAt(k);
            }else {
                return false;
            }
        }
        return true;
    }
}
