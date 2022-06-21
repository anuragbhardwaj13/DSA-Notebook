import java.util.Scanner;

public class ExitPoint {
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
        scan.close();
        int dir = 0; // 0->E 1->S 2->W 3->N
        int i = 0;
        int j = 0;
        while (true) {
            dir = (dir + matrix[i][j]) % 4;
            if (dir == 0) {
                j++;
            
            } else if (dir == 1) {
                i++;
            } else if (dir == 2) {
                j--;
            } else if (dir == 3) {
                i--;
            }
           
            if(i<0){
                i++;
                break;
            }else if(j<0){
                j++;
                break;
            }else if(i==r1){
                i--;
                break;
            }else if(j==c1){
                j--;
                break;
            }
        }
        System.out.println(i+","+j);

    }
}
