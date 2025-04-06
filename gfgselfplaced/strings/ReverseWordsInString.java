package gfgselfplaced.strings;

import java.util.Stack;

public class ReverseWordsInString {
    public static void main(String[] args) {
        System.out.println(reverseWordsInString("I Love  Coding"));
    }

    private static String reverseWordsInString(String string) {
        Stack<String> stack = new Stack<>();
        int start = 0;
        boolean flag = true;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == ' ') {
                if (flag) {
                    String word = string.substring(start, i);
                    stack.push(word);
                    start = i + 1;
                    flag = false;
                } else {
                    start = i + 1;
                }
            } else {
                flag = true;
            }
        }
        String lastWord = string.substring(start);
        stack.push(lastWord);
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop()).append(" ");
        }

        return sb.toString();
    }
}
