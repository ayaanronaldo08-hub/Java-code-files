import java.util.Arrays;
import java.util.Scanner;

public class twodarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Num of rows: ");
        int rows = sc.nextInt();

        System.out.println("Num of columns: ");
        int columns = sc.nextInt();

        int arr[][] = new int[rows][columns];

        System.out.println("Enter elements: ");

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                int e = sc.nextInt();
                arr[i][j] = e;
            }
        }

        System.out.println("Array: " + Arrays.deepToString(arr));
    }
}
