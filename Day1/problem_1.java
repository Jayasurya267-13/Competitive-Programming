import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        long max = Long.MIN_VALUE;
        long max2 = Long.MIN_VALUE;
        boolean foundSecond = false;

        for (int i = 0; i < n; i++) {
            long num = sc.nextLong();

            if (num > max) {
                if (max != Long.MIN_VALUE) {
                    max2 = max;
                    foundSecond = true;
                }
                max = num;
            }
            else if (num < max && (!foundSecond || num > max2)) {
                max2 = num;
                foundSecond = true;
            }
        }

        System.out.println(foundSecond ? max2 : -1);
        sc.close();
    }
}