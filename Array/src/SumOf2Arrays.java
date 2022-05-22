import java.util.Scanner;

public class SumOf2Arrays {
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
        int[] sum = new int[n1 > n2 ? n1 : n2];
        int carry = 0;
        int i = n1 - 1;
        int j = n2 - 1;
        int k = sum.length - 1;
        while (k >= 0) {
            int dig = carry;
            if (i >= 0) {
                dig += arr1[i];
            }
            if (j >= 0) {
                dig += arr2[j];
            }

            carry = dig / 10; // it will get us carry value
            dig = dig % 10; // it will find remainder only such as 5%10 will be equal to 5 and 15%10 will be
                            // equal to 5
            sum[k] = dig;
            i--;
            j--;
            k--;
        }

        if (carry != 0) {
            System.out.print(carry + "\t");
        }
        for (int val : sum) {
            System.out.print(val + "\t");
        }

    }
}
