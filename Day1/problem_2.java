import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        long sum = 0;
        long expected = (long) n * (n + 1) / 2;

        for (int i = 0; i < n - 1; i++) {
            long num = sc.nextLong();
            sum += num;
        }

        System.out.println(expected - sum);
        sc.close();
    }
}