package gfgselfplaced.arrays;

public class StockBuyAndSell1 {
    public static void main(String[] args) {
       // int arr[] = {1, 5, 3, 8, 12}; 13
        // int arr[] = {10,20,30,40}; 30
//         int arr[] = {40,30,20,10};
        int arr[] = {7,1,5,3,6,4};
        stockBuyAndSell1(arr);
    }

    private static void stockBuyAndSell1(int[] arr) {
        int profit = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] > arr[i]){
                    profit = Math.max(profit, arr[j] - arr[i]);
                }
            }
        }

        System.out.println(profit);
    }
}
