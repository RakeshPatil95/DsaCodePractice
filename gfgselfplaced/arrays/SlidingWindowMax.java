package gfgselfplaced.arrays;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Stack;

public class SlidingWindowMax {
    public static void main(String[] args) {
        System.out.println(
                Arrays.toString(maxSlidingWindow(new int[]{1,-1}, 1)));
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
//        int[] result = new int[nums.length - k + 1];
//        int idx = 0;
//        Stack<Integer> stack = new Stack<>();
//        for (int i = 0; i < k; i++) {
//            if (!stack.isEmpty() && nums[i] >= stack.peek()) {
//                result[idx++] = nums[i];
//                stack.pop();
//                stack.push(nums[i]);
//            } else {
//                if (stack.isEmpty()) {
//                    stack.push(nums[i]);
//                }
//            }
//        }
//        if(idx == 0){
//            result[idx++] = nums[0];
//            stack.pop();
//        }
//        for (int i = k; i < nums.length; i++) {
//            if (!stack.isEmpty() && nums[i] >= stack.peek()) {
//                result[idx++] = nums[i];
//                stack.pop();
//                stack.push(nums[i]);
//            } else {
//                if (stack.isEmpty()) {
//                    stack.push(nums[i]);
//                }
//                result[idx++] = stack.peek();
//            }
//        }
//
//        return result;
        // 1,3,-1,-3,5,3,6,7
        int[] result = new int[nums.length - k + 1];
        int idx = 0;
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < nums.length; i++) {
            while (!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.pollFirst();
            }
            while (!deque.isEmpty() && nums[deque.peekLast()] <= nums[i]) {
                deque.pollLast();
            }
            deque.offerLast(i);
            if (i >= k - 1) {
                result[idx++] = nums[deque.peekFirst()];
            }
        }
        return result;
    }
}
