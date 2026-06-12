import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.println("Enter num 1: ");
        Double num1 = Sc.nextDouble();
        
        Sc.nextLine();

        System.out.println("Enter num 2: ");
        Double num2 = Sc.nextDouble();

        Sc.nextLine();

        System.out.println("Enter operation:");
        char operation = Sc.next().charAt(0);

        switch(operation){
            case '+':
                System.out.println("The sum of num1 & num2 is: " + (num1 + num2));
                break;
            case '-':
                System.out.println("The difference between num1 & num2 is: " + (num1-num2));
                break;
            case '*':
                System.out.println("The product of num1 & num2 is: " + (num1*num2));
                break;
            case '/':
                System.out.println("The quotient of num1 & num2 is: " + (num1/num2));
                break;
            default:
                System.out.println("Enter a valid operation");
        }

    }
}
