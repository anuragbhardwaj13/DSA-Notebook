
public class MaximumProductOf3Num {
    public static void main(String[] args) {
        int[] arr = new int[] { -100, -98, -1, 2, 3, 4 };
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;

        for (int n : arr) {
            if (n <= min1) {
                min2 = min1;
                min1 = n;
            } else if (n <= min2) {
                min2 = n;
            }
            if (n >= max1) {
                max3 = max2;
                max2 = max1;
                max1 = n;
            } else if (n >= max2) {
                max3 = max2;
                max2 = n;
            } else if (n >= max3) {
                max3 = n;
            }
        }
        int ans = Math.max(min1 * min2 * max1, max1 * max2 * max3);
        System.out.println(ans);

    }
}
