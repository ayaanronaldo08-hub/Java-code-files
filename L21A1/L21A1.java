import java.util.Arrays;
import java.util.Scanner;

public class L21A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[][] = {{1,2,3},
                       {4,5,6},
                       {7,8,9}};

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("What value do you want to access: ");
        System.out.println("Row: ");
        int row = sc.nextInt();
        System.out.println("Column: ");
        int column = sc.nextInt();

        System.out.println("Value: " + arr[row-1][column-1]);

        System.out.println("Select value to update: ");
        System.out.println("Row: ");
        int rowupd = sc.nextInt();
        System.out.println("Column: ");
        int columnupd = sc.nextInt();

        System.out.println("Enter value to change it to:");
        int val = sc.nextInt();

        arr[rowupd-1][columnupd-1] = val;

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
