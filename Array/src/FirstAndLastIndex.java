import java.util.Scanner;

public class FirstAndLastIndex {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int d = scan.nextInt();
        scan.close();
        // first index
        int low = 0;
        int high = arr.length - 1;
        int first = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (d > arr[mid]) {
                low = mid + 1;
            } else if (d < arr[mid]) {
                high = mid - 1;
            } else {
                first = mid;
                high = mid - 1; // checking ledt side of mid for first index
            }
        }
        // last index
        low = 0;
        high = arr.length - 1;
        int last = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (d > arr[mid]) {
                low = mid + 1;
            } else if (d < arr[mid]) {
                high = mid - 1;
            } else {
                last = mid;
                low = mid + 1; // checking right side of mid for last index
            }
        }
        System.out.println(first + "\n" + last);

    }

}
