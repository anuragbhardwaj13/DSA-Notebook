import java.util.HashMap;
import java.util.Scanner;

public class MajorityElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scan.nextInt();
        }
        scan.close();
        System.out.println(getMajority(nums));
        // getMajority(nums);
    }

    public static int getMajority(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int count;
        int num;
        for (int i = 0; i < nums.length; i++) {
            num = nums[i];
            if (hm.containsKey(num)) {
                count = hm.get(num);
                count++;
                hm.replace(num, count);
            } else {
                hm.put(num, 1);
            }
        }
        for (int key : hm.keySet()) {
            if (hm.get(key) > (nums.length / 3)) {
                return key;
            }
        }
        return -1;
    }
}
