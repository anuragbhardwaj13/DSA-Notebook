import java.util.Scanner;

//using mod 
public class RotateArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int k = scan.nextInt();
        scan.close();
        int[] temp=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp[(i + k) % arr.length] = arr[i];
        }
        
    arr=temp;  

        for (int val : arr) {
            System.out.print(val+" ");
        }
    }
}
