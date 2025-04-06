package gfgselfplaced.strings;

public class Recursion {
    public static void main(String[] args) {
        printNos(10);
    }

    public static void printNos(int N) {
        if (N == 0) {
            return;
        }
        printNos(--N);
        System.out.println(N+1);
    }
}

