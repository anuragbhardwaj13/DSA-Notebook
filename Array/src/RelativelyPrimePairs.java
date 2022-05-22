import java.util.Scanner;

public class RelativelyPrimePairs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Long l = scan.nextLong();
        Long r = scan.nextLong();
        System.out.println("YES");
        scan.close();
        for (Long i = l; i < r ; i += 2) {
            System.out.println(Long.toString(i)+" "+Long.toString(i+1));
        }
    }
}
