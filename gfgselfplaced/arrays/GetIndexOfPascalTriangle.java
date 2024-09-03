package Coding;

public class GetIndexOfPascalTriangle {
    public static void main(String[] args) {
        System.out.println(getIndexOfPascalTriangle(3,2));
    }

    public static int getIndexOfPascalTriangle(int row, int col){
        int [][] arr = new int[row+1][col+1];
        for(int i = 0; i <= row; i++){
            arr[i][0] = 1; // First element of each row is 1
            for(int j = 1; j < i; j++){
                arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
            }
            arr[i][i] = 1; // Last element of each row is 1
        }
        for (int i = 0; i <= row; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); // Move to the next line after printing each row
        }
        return arr[row][col];
    }
}
