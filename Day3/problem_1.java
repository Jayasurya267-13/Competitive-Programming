import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] arr = new long[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }

        long target = sc.nextLong();

        Arrays.sort(arr);

        int left = 0;
        int right = n - 1;

        boolean matches = false;

        while (left < right) {

            long sum = arr[left] + arr[right];

            if (sum == target) {
                matches = true;
                break;
            }
            else if (sum < target) {
                left++;
            }
            else {
                right--;
            }
        }

        System.out.println(matches ? "YES" : "NO");

        sc.close();
    }
}