package Coding;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
//        System.out.println(searchInRotatedSortedArray(new int[]{4,5,6,7,0,1,2},0));
//        System.out.println(searchInRotatedSortedArray(new int[]{5,1,3},5));
        System.out.println(searchInRotatedSortedArray(new int[]{3,1},1));
    }

    private static int searchInRotatedSortedArray(int[] nums, int target) {
        int left = 0;
        int right =nums.length-1;
        int mid = (left+right)/2;
        if(nums[mid] == target) return mid;
        if(nums[mid]>nums[left]){
            if(target >= nums[left] && target <= nums[mid]){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }else{
            if(target <= nums[right] && target >= nums[mid]){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        while(left<=right){
            mid = (left+right)/2;
            if(nums[mid] == target) return mid;
            if(nums[mid] > target){
                right= mid-1;
            }else{
                left = mid+1;
            }
        }

        return -1;
    }
}
