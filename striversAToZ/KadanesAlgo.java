package striversAToZ;

public class KadanesAlgo {
    public static void main(String[] args) {
        System.out.println(method1(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }

    private static int method1(int[] nums) {
        int result = Integer.MIN_VALUE;
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] > sum){
                
            }
        }
        return 0;
    }
}
