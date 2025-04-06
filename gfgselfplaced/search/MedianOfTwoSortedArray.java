package gfgselfplaced.search;

public class MedianOfTwoSortedArray {
    public static void main(String[] args) {
//        System.out.println(medianOfTwoSortedArray(new int[]{10, 20, 30, 40, 50}, new int[]{5, 15, 25, 30, 35, 55, 65, 75, 85}));
        System.out.println(medianOfTwoSortedArray(new int[]{2}, new int[]{1, 3}));
        System.out.println(medianOfTwoSortedArray(new int[]{1, 3}, new int[]{2}));
        System.out.println(medianOfTwoSortedArray(new int[]{3,4}, new int[]{1,2}));
    }

    private static double medianOfTwoSortedArray(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
        }
        int begin = 0;
        int end = nums1.length;
        while (begin <= end) {
            int i1 = (begin + end) / 2;
            int i2 = ((nums1.length + nums2.length + 1) / 2) - i1;
            int min1 = (i1 == nums1.length) ? Integer.MAX_VALUE : nums1[i1];
            int max1 = (i1 == 0) ? Integer.MIN_VALUE : nums1[i1 - 1];
            int min2 = (i2 == nums2.length) ? Integer.MAX_VALUE : nums2[i2];
            int max2 = (i2 == 0) ? Integer.MIN_VALUE : nums2[i2 - 1];

            if (Integer.max(max1, max2) <= Integer.min(min1, min2)) {
                if ((nums1.length + nums2.length) % 2 == 0) {
                    return (double) ((Integer.max(max1, max2)) + (Integer.min(min1, min2))) / 2;
                } else {
                    return (Integer.max(max1, max2));
                }
            } else {
                if (max1 > min2) {
                    end = i1 - 1;
                } else {
                    begin = i1 + 1;
                }
            }
        }
        return 0;
    }
}
