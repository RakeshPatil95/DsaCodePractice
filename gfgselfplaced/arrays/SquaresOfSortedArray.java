package gfgselfplaced.arrays;

import java.util.Arrays;

public class SquaresOfSortedArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(squaresOfSortedArray(new int[]{-5,-3,-2,-1})));
    }

    private static int[] squaresOfSortedArray(int[] nums) {
        int left=0;
        int right = 0;
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] >= 0){
                left=right=i;
                break;
            }
        }
        if(left == 0){
            int idx=0;
            for (int num: nums){
                result[idx++] = num*num;
            }
        }else{
            int idx = 0;
            result[idx++] = nums[left]*nums[right];
            right++;
            left--;
            while(left != -1 && right != nums.length){
                if(nums[left]*nums[left] < nums[right]*nums[right]){
                    result[idx++] = nums[left]*nums[left];
                    left--;
                }else {
                    result[idx++] = nums[right]*nums[right];
                    right++;
                }
            }
          while (right != nums.length){
              result[idx++] = nums[right]*nums[right];
              right++;
          }
            while (left != -1){
                result[idx++] = nums[left]*nums[left];
                left--;
            }
        }
        return result;
    }
}
