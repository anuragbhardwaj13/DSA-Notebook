import java.util.ArrayList;
import java.util.Scanner;

//subset or subsequence
public class Subsets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        scan.close();
        ArrayList<Integer> list = new ArrayList<>();
        subset(arr, list, 0);
    }

    public static void subset(int[] arr, ArrayList<Integer> list, int index) {
        if (index >= arr.length) {
            System.out.println(list);
            return;
        }
        list.add(arr[index]);
        subset(arr, list, index + 1);
        list.remove(list.size() - 1);
        subset(arr, list, index + 1);

    }
}
