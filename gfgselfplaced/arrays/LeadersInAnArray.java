package gfgselfplaced.arrays;

public class LeadersInAnArray {
    public static void main(String[] args) {
        int arr[] = {7, 10, 4, 10, 6, 5, 2};
        leadersInAnArray(arr);
    }

    // complex. theta(n)
    private static void leadersInAnArray(int[] arr) {
        if (arr.length == 0) {
            return;
        }

        if (arr.length == 1) {
            System.out.println(arr[0]);
        }
        int currLeader = arr[arr.length - 1];
        System.out.print(currLeader + " ");
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > currLeader) {
                currLeader = arr[i];
                System.out.print(currLeader + " ");
            }
        }
    }
}
