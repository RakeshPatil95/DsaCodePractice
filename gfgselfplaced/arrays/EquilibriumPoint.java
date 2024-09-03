package Coding;

public class EquilibriumPoint {
    public static void main(String[] args) {
        System.out.println(equilibriumPoint(new int[]{3, 4, 8, -9, 20, 6}));
        System.out.println(equilibriumPoint(new int[]{4, 2, -2}));
        System.out.println(equilibriumPoint(new int[]{0, 0, 0, 0, 0}));
        System.out.println(equilibriumPoint(new int[]{3, 4, 8, -9, 9, 7}));
    }

    private static boolean equilibriumPoint(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int lSum = 0;
        int rSum = 0;
        for (int i = 0; i < arr.length; i++) {
            rSum = sum - lSum;
            if (i != 0) {
                lSum += arr[i - 1];
            }
            if (lSum == rSum) {
                return true;
            }
        }
        return false;
    }

//    private static boolean equilibriumPoint(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            int lSum = 0;
//            for (int j = 0; j < i; j++) {
//                lSum += arr[j];
//            }
//            int rSum = 0;
//            for (int k = i + 1; k < arr.length; k++) {
//                rSum += arr[k];
//            }
//            if (lSum == rSum) {
//                return true;
//            }
//        }
//        return false;
//    }
}
