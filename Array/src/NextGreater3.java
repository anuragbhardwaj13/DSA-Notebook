import java.util.Scanner;

public class NextGreater3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        int ans = nextGreater(n);
        System.out.println(ans);
    }

    public static int nextGreater(int n) {
        char[] str = (n + "").toCharArray();
        int deflectionPoint = str.length - 1;
        // finding deflection point
        while (deflectionPoint > 0) {
            if (str[deflectionPoint] > str[deflectionPoint - 1]) {
                break;
            }
            deflectionPoint--;
        }
        // no deflection point found
        if (deflectionPoint == 0) {
            return -1;
        }
        // index to swap
        int firstSwap = deflectionPoint - 1;
        // System.out.println(str[firstSwap]);
        int smallest = deflectionPoint;
        // System.out.println(str[smallest]);
        for (int j = deflectionPoint; j < str.length; j++) {
            if (str[j] > str[firstSwap] && str[j] <= str[smallest]) {
                smallest = j;
            }
        }
        // System.out.println(str[smallest]);
        // swap
        char temp = str[smallest];
        str[smallest] = str[firstSwap];
        str[firstSwap] = temp;
        // now reverse the last part
        reverse(str, deflectionPoint, str.length - 1);
        // System.out.println(str);
        // now convert it to a long and then it to a int
        long ans = Long.parseLong(new String(str));
        int answer = (int) ans;
        return ans <= Integer.MAX_VALUE ? answer : -1;

    }

    private static void reverse(char[] arr, int first, int last) {

        while (first <= last) {
            char temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }

    }
}
