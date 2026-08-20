import java.util.Arrays;
import java.util.Scanner;

public class matrixmult{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Rows for a1:");
        int n1 = sc.nextInt();

        System.out.println("Columns for a1:");
        int m1 = sc.nextInt();

        int[][] a1 = new int[n1][m1];

        System.out.println("Enter elements:");
        for(int i = 0; i < n1; i++){
            for(int j = 0; j < m1; j++){
                a1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Rows for a1:");
        int n2 = sc.nextInt();

        System.out.println("Columns for a1:");
        int m2 = sc.nextInt();

        int[][] a2 = new int[n2][m2];

        System.out.println("Enter elements:");
        for(int i = 0; i < n2; i++){
            for(int j = 0; j < m2; j++){
                a2[i][j] = sc.nextInt();
            }
        }

        if (m1 == n2){
            int[][] result = new int[n1][m2];
            for (int i = 0; i < n1; i++) {
                for (int j = 0; j < m2; j++) {
                    for (int k = 0; k < m1; k++) {
                        result[i][j] += a1[i][k] * a2[k][j];
                    }
                }
            }

            System.out.println("Result: " + Arrays.deepToString(result));
        } else {
            System.out.println("Invalid");
        }
    }
}
