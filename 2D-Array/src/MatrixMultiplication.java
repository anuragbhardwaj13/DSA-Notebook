import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scan = new Scanner(System.in);
        int r1 = scan.nextInt();
        int c1 = scan.nextInt();
        int[][] matrix1 = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                matrix1[i][j] = scan.nextInt();
            }
        }
        int r2 = scan.nextInt();
        int c2 = scan.nextInt();
        int[][] matrix2 = new int[r2][c2];
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                matrix2[i][j] = scan.nextInt();
            }
        }
        scan.close();
        if (c1 != r2) {
            System.out.println("Invalid input");
            return;
        } else {
            int[][] prod = new int[r1][c2];
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    int sum = 0;
                    for (int k = 0; k < c1; k++) {
                        sum += matrix1[i][k] * matrix2[k][j];
                    }
                    prod[i][j] = sum;
                }
            }

            for (int i = 0; i < prod.length; i++) {
                for (int j = 0; j < prod[0].length; j++) {
                    System.out.print(prod[i][j] + " ");
                }
                System.out.println();
            }
        }

    }

}
