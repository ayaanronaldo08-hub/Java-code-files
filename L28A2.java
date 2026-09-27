import java.util.Scanner;

public class L28A2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of array: ");
        int n = sc.nextInt();

        int[] array = new int[n];

        System.out.print("Enter the elements: ");
        for (int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }

        displayArray(n, array);
    }

    public static void displayArray(int n, int[] array){
        if (n == 0){
            return;
        }

        System.out.println(array[n-1]);

        displayArray(n-1, array);
    }
}