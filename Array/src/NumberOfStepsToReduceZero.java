public class NumberOfStepsToReduceZero {
    public static void main(String[] args) {
        int num = 8;
        int step = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                num = num / 2;
                // System.out.println(num);
                step++;
            } else {
                num = num - 1;
                // System.out.println(num);
                step++;

            }
        }
        System.out.println(step);
    }
}
