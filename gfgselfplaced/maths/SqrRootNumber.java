package gfgselfplaced.maths;

public class SqrRootNumber {
    public static void main(String[] args) {
//        System.out.println(sqrRoot(4));
        System.out.println(sqrRoot(8));
    }

    private static int sqrRoot(int i) {
        int count = i;
        int temp = 0;
        for (int j = 1; j <= i; j += 2) {
            temp++;
            count -= j;
            if (count <= 0) {
                return temp;
            }
        }
        return 0;
    }
}
