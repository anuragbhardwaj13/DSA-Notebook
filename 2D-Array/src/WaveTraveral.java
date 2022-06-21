import java.util.Scanner;

public class WaveTraveral {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int r1 = scan.nextInt();
        int c1 = scan.nextInt();
        int[][] matrix1 = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                matrix1[i][j] = scan.nextInt();
            }
        }
        // System.out.println("Ans");
       for(int col=0;col<c1;col++){
        if(col%2==0){
            for(int row=0;row<r1;row++){
                System.out.println(matrix1[row][col]);
            }
        }else if(col%2!=0){
            for(int row=r1-1;row>=0;row--){
                System.out.println(matrix1[row][col]);
            }
        }
       }
        scan.close();
    }
}
