package gfgselfplaced.arrays;

import java.util.*;
import java.util.Collections;
import java.util.stream.Collectors;

public class HowManyNoAreSmallerThanCurrent {
    public static void main(String[] args) {
        System.out.println(
                Arrays.toString(smallerNumbersThanCurrent(new int[]{7,7,7,7})));
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        List<Integer> list = Arrays.stream(nums)
                .boxed().sorted().collect(Collectors.toList());

        int[] copy = Arrays.copyOf(nums, nums.length);
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = list.indexOf(nums[i]);
        }
        return result;
    }
}
