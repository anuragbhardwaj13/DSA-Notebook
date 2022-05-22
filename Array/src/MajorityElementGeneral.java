import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class MajorityElementGeneral {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scan.nextInt();
        }
        int k=scan.nextInt();
        scan.close();
        System.out.println(getMajority(nums,k));
        // getMajority(nums);
    }

    public static List<Integer> getMajority(int[] nums,int k) {
        List<Integer> list = new ArrayList<Integer>();
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
            if (hm.get(key) > (nums.length / k)) {
                list.add(key);
            }
        }
        return list;
    }
}
