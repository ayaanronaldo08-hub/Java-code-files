import java.util.Scanner;

public class addition {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Give number 1: ");
        double num1 = Sc.nextDouble();
        System.out.println("Give number 2: ");
        double num2 = Sc.nextDouble();
        double Final;
        if ((num1 >= 0) && (num2 >= 0)){
            Final = num1 + num2;
            System.out.println("The sum of the 2 numbers is: " + Final);
        } else{
            System.out.println("Please make sure both numbers are positive");
        }
    }
}
