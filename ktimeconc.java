import java.util.Arrays;
import java.util.Scanner;

public class ktimeconc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length: ");
        int n = sc.nextInt();
        
        int array[] = new int[n];

        System.out.println("Enter elements");
        for (int i = 0; i < n; i++){
            int e = sc.nextInt();
            array[i] = e;
        }

        System.out.println("Enter k: ");
        int k = sc.nextInt();

        int arrayb[] = new int[n*k];

        for (int i = 0; i < k; i++){
            for (int j = 0; j < n; j++){
                arrayb[i * n + j] = array[j];
            }
        }

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(arrayb));

        int maxSum = arrayb[0];
        int currentSum = arrayb[0];

        for (int i = 1; i < arrayb.length; i++) {
            currentSum = Math.max(arrayb[i], currentSum + arrayb[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        System.out.println("Maximum subarray sum: " + maxSum);
    }
}


