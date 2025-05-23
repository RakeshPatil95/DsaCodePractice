package gfgselfplaced.arrays;

public class SortColors {
    public static void main(String[] args) {
        int[] arr = new int[]{2,0,1};
        sortColors(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
    public static void sortColors(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        for (int i = 0; i < nums.length - 1; ) {
            if(i > high){
                break;
            }
            if (nums[i] == 0) {
                swap(nums, low, i);
                low++;
                i++;
            }else
            if (nums[i] == 1) {
                i++;
            }else
            if (nums[i] == 2) {
                swap(nums, i, high);
                high--;
            }
        }
    }

    private static void swap(int[] nums, int i, int j) {
        final int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
