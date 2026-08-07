import java.util.Scanner;

public class L20A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array length:");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++){
            int e = sc.nextInt();
            arr[i] = e;
        }

        System.out.println("Largest contiguous sum: " + sum(arr));
    }
    static int sum(int [] array){
        int length = array.length;
        int maximum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < length; i++){
            sum = sum + array[i];

            if (sum > maximum){
                maximum = sum;
            }
        }

        return maximum;
    }
}

