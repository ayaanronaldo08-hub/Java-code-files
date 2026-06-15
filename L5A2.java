import java.util.Scanner;

public class L5A2 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int num = Sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= num; i++){
            sum = sum + i;
        }
        
        System.out.println("The sum till " + num + " is " + sum);
    }
}
