package gfgselfplaced.maths;

public class HfcCalculator {

    public static void main(String[] args) {
        System.out.println(hfcCalculator(98, 56));
    }

    private static int hfcCalculator(int i, int j) {
        if (i == j) {
            return i;
        }
        if (i > j) {
            return hfcCalculator((i - j), j);
        }
        return hfcCalculator((j - i), i);
    }
}
