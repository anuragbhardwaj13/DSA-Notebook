import java.util.Scanner;

public class DiffOf2Arrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = scan.nextInt();
        }
        int n2 = scan.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = scan.nextInt();
        }
        scan.close();

        int[] diff = new int[n2];
        int i = arr2.length - 1;
        int j = arr1.length - 1;
        int k = diff.length - 1;
        int carry = 0;
        while (k >= 0) {
            int difference = 0;
            int a1v = j >= 0 ? arr1[j] : 0;
            int a2v = arr2[i];
            if (a2v + carry > a1v) {
                difference = a2v + carry - a1v;
                carry = 0;
            } else {
                difference = a2v + 10 + carry - a1v;
                carry = -1;
            }
            diff[k] = difference;
            i--;
            j--;
            k--;

        }
        int zeroIdx = 0;
        while (zeroIdx < diff.length && zeroIdx == 0) {
            zeroIdx++;
        }
        while (zeroIdx < diff.length) {
            System.out.println(diff[zeroIdx++]);
        }
    }
}
