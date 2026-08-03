import java.util.Scanner;

public class L19A2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Enter d: ");
        int d = sc.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < n; i++){
            System.out.println("Enter elements: ");
            int num = sc.nextInt();
            array[i] = num;
        }

        for (int i = 0; i < n; i++){
            if (array[i] == d){
                System.out.println("d value found at index " + i);
            } else {
                System.out.println("-1");
            }
        }
    }
}
