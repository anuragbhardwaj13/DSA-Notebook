import java.util.Scanner;

public class ReverseAnArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        scan.close();
        System.out.println("Normal Array");
        for (int val : arr) {
            System.out.print(val + " ");
        }
        int first = 0;
        int last = arr.length - 1;
        while (first <= last) {
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
        System.out.println("Reversed Array");
        for (int val : arr) {
            System.out.print(val + " ");
        }

    }
    
}
