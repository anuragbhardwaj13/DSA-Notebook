import java.util.Scanner;

public class SpiralTraversal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int r1 = scan.nextInt();
        int c1 = scan.nextInt();
        int[][] matrix = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }
        int count = 0;
        int totalElements = r1 * c1;
        scan.close();
        int minR = 0;
        int minC = 0;
        int maxR = r1 - 1;
        int maxC = c1 - 1;
        while (count < totalElements) {
            // leftwall
            for (int i = minR, j = minC; i <= maxR && count < totalElements; i++) {
                System.out.println(matrix[i][j]);
                count++;
            }
            minC++;
            // bottomwall
            for (int i = maxR, j = minC; j <= maxC && count < totalElements; j++) {
                System.out.println(matrix[i][j]);
                count++;
            }
            maxR--;
            // Rightwall
            for (int i = maxR, j = maxC; i >= minR && count < totalElements; i--) {
                System.out.println(matrix[i][j]);
                count++;
            }
            maxC--;
            // TopWall
            for (int i = minR, j = maxC; j >= minC && count < totalElements; j--) {
                System.out.println(matrix[i][j]);
                count++;
            }
            minR++;
        }
    }
}
