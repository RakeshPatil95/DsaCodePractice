package Coding;

public class TrailingZerosInFactorial {
    public static void main(String[] args) {
//        System.out.println(trailingZeroes(3));
//        System.out.println(trailingZeroes(5));
//        System.out.println(trailingZeroes(25));
        System.out.println(trailingZeroes(200));

    }

    private static int trailingZeroes(int n) {
        int count = 0;
        for (int i = 5; i <= n; i *= 5) {
            count += (n / i);
        }
        return count;
    }
}
