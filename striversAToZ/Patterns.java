package striversAToZ;

public class Patterns {
    public static void main(String[] args) {
//        quarePattern();
//        leftSideTringle();
//        leftSideNumbers();
//        tringle();
        butterfly(10);

    }

    private static void butterfly(int N) {
        for (int row = 1; row <= N * 2 - 1; row++) {
            for (int col = 1; col <= N * 2; col++) {
                if (row <= N) {
                    if (col <= row || col >= N * 2 - row + 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    if (col <= N * 2 - row || col > row) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }

    private static void tringle() {
        int counter = 1;
        for (int i = 4; i >= 0; i--) {
            System.out.println();
            for (int j = i; j <= counter; j++) {
                System.out.print("*" + " ");
            }
            counter += 2;
            System.out.println();
        }
    }

    private static void leftSideNumbers() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j + 1 + " ");
            }
            System.out.println();
        }
    }

    private static void leftSideTringle() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    private static void quarePattern() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
