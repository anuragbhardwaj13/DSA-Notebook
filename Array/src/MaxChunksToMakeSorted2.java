public class MaxChunksToMakeSorted2 {
    public static void main(String[] args) {
        int[] arr = new int[] { 2, 1, 3, 4, 4 };
        // TODO: Generate Right Min Array
        int[] rmin = new int[arr.length + 1];

        rmin[arr.length] = Integer.MAX_VALUE;
        for (int i = arr.length - 1; i >= 0; i--) {
            rmin[i] = Math.min(arr[i], rmin[i + 1]);
        }
        // TODO: Generate LeftMax element and compare it to increase chunks count
        int lmax = Integer.MIN_VALUE;
        int cc = 0;
        for (int i = 0; i < arr.length; i++) {
            lmax = Math.max(lmax, arr[i]);
            if (lmax <= rmin[i + 1]) {
                cc++;
            }
        }
        System.out.println(cc);

    }
}
