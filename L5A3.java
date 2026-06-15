import java.util.Scanner;

public class L5A3 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        int num;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        char choice;

        do{
            System.out.println("Enter an integer: ");
            num = Sc.nextInt();

            if (num > max){
                max = num;
            } else if (num < min){
                min = num;
            }

            System.out.println("Do you want to continue(y/n): ");
            choice = Sc.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');
        
        System.out.println("The maximum is: " + max);
        System.out.println("The minimum is: " + min);
    }
}
