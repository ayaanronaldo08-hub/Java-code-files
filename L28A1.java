import java.util.Scanner;
import java.util.Arrays;

public class L28A1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of array: ");
        int n = sc.nextInt();

        int[] array = new int[n];

        System.out.print("Enter the elements: ");
        for (int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }

        displayArray(0, array);
    }

    public static void displayArray(int n, int[] array){
        if (n == array.length){
            return;
        }

        System.out.println(array[n]);

        displayArray(++n, array);
    }
}