import java.util.Scanner;

public class CeilAndFloor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int d = scan.nextInt();
        scan.close();
        int low = 0;
        int high = arr.length - 1;
        int ceil = Integer.MAX_VALUE;
        int floor = Integer.MIN_VALUE;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (d < arr[mid]) {
                // System.out.println("low : " + arr[low] + " high : " + arr[high] + " mid : " + arr[mid]);
                high = mid - 1;
                ceil = mid;
            }
            if (d > arr[mid]) {
                // System.out.println("low : " + arr[low] + " high : " + arr[high] + " mid : " + arr[mid]);
                low = mid + 1;
                floor = mid;
            }
            if (d == arr[mid]) {
                // System.out.println("low : " + arr[low] + " high : " + arr[high] + " mid : " + arr[mid]);
                ceil = mid;
                floor = mid;
            }
        }
        System.out.println(arr[ceil] + "\n" + arr[floor]);
    }

}
