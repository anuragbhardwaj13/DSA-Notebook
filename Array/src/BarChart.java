import java.util.Scanner;

//[https://nados.io/question/bar-chart]
public class BarChart {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
            // this will get us Max element
            max = Math.max(arr[i], max);
        }
        scan.close();
        for (int i = 0; i < max; i++) {// max rows
            for (int val : arr) {// for each column
                if (max - i <= val) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
