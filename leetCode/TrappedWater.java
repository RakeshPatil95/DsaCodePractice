package leetCode;

public class TrappedWater {
    public static void main(String[] args) {
        System.out.println(trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
    }

    private static int trap(int[] h) {
        int i = 0;
        int j = 1;
        int temp = 0;
        int result = 0;
        while (i != j && i != h.length - 1) {
            if (h[j] < h[i]) {
                temp += (h[i] - h[j]);
                j++;
            } else {
                if (j == h.length - 1) {
                    i++;
                    j = i + 1;
                } else {
                    result += temp;
                    i = j;
                    j++;
                }
            }
        }
        return result;
    }
}
