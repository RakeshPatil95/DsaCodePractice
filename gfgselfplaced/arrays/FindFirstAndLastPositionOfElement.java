package gfgselfplaced.arrays;

public class FindFirstAndLastPositionOfElement {
    public static void main(String[] args) {
//        System.out.println(findFirstAndLastPositionOfElement(new int[]{5,7,7,8,8,10},8));
//        System.out.println(findFirstAndLastPositionOfElement(new int[]{1},1));
        System.out.println(findFirstAndLastPositionOfElement(new int[]{2, 2}, 2));
    }

    private static int[] findFirstAndLastPositionOfElement(int[] arr, int target) {
        int a = findFirstPositionOfElement(arr, target);
        int b = findLastPositionOfElement(arr, target);
        return new int[]{a, b};
    }

    private static int findLastPositionOfElement(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                if(mid == arr.length - 1 || arr[mid + 1] != target) {
                    System.out.println(mid);
                    return mid;
                }else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

    private static int findFirstPositionOfElement(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                if (mid == 0 || arr[mid - 1] != target) {
                    System.out.println(mid);
                    return mid;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
