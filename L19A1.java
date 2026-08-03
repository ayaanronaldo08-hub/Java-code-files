import java.util.Scanner;

public class L19A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int n = sc.nextInt();

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i<n; i++){
            System.out.println("Enter value: ");
            int val = sc.nextInt();
            if (val > max){
                max = val;
            }
            if (val < min){
                min = val;
            }
        }

        int range = max-min;

        System.out.println("Range: " + range);
    }
}
