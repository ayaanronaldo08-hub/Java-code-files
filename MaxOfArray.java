import java.util.Scanner;

public class MaxOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements in the list: ");
        int n = sc.nextInt();

        int[] array = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i<n; i++){
            array[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;

        arrayMax(0,array,max);
    }

    public static void arrayMax(int n, int[] array, int max){
        if (n == array.length){
            System.out.println("Maximum: " +  max);
            return;
        }

        if (array[n] > max){
            max = array[n];
        } 

        arrayMax(++n, array, max);
    }
}
