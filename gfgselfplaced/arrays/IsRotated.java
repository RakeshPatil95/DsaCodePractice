package Coding;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;

// 3:26
public class IsRotated {
    public static void main(String[] args) {
        System.out.println(isRotated("amazon", "noamaz"));
    }

    private static boolean isRotated(String str1, String str2) {
        char[] chr1 = str1.toCharArray();
        rotateByTwo(chr1, 0, 1);
        rotateByTwo(chr1, 2, chr1.length - 1);
        rotateByTwo(chr1, 0, chr1.length - 1);
        StringBuilder sb1 = new StringBuilder();
        for (char c : chr1){
            sb1.append(c);
        }
        if (str2.contentEquals(sb1)) {
            return true;
        } else {

            char[] chr2 = str1.toCharArray();
            rotateByTwo(chr2, chr2.length - 2, chr2.length - 1);
            rotateByTwo(chr2, 0, chr1.length - 2);
            rotateByTwo(chr2, 0, chr1.length - 1);
            StringBuilder sb2 = new StringBuilder();
            for (char c : chr2) {
                sb2.append(c);
            }
            if (str2.contentEquals(sb2)) {
                return true;
            }
        }


        return false;
    }

    private static void rotateByTwo(char[] chr1, int start, int end) {
        while (start <= end) {
            char temp = chr1[start];
            chr1[start] = chr1[end];
            chr1[end] = temp;
            start++;
            end--;
        }
    }
}
