import java.util.ArrayList;
import java.util.Scanner;

public class Permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements:");
        int n = sc.nextInt();

        System.out.println("Enter kth:");
        int k = sc.nextInt();

        permutation(n, k);
        sc.close();
    }

    public static void permutation(int n, int k) {
        if (n < 1) {
            System.out.println("n must be at least 1");
            return;
        }

        int[] fact = new int[n];
        fact[0] = 1;
        for (int i = 1; i < n; i++) {
            fact[i] = fact[i - 1] * i;
        }

        int total = fact[n - 1] * n;
        if (k < 1 || k > total) {
            System.out.println("k must be between 1 and " + total);
            return;
        }

        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            nums.add(i);
        }

        k--;
        String result = "";
        for (int i = n - 1; i >= 0; i--) {
            int idx = k / fact[i];
            result += nums.remove(idx);
            k %= fact[i];
        }

        System.out.println(result);
    }
}