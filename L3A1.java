import java.util.Scanner;

public class L3A1 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int integer = Sc.nextInt();
        System.out.println("Your integer is: " + integer);
        Sc.nextLine();

        System.out.println("Enter a string: ");
        String text = Sc.nextLine();
        System.out.println("Your string is: " + text);

        System.out.println("Enter a double: ");
        Double decimal = Sc.nextDouble();
        System.out.println("Your double is: " + decimal);
        Sc.nextLine();

        System.out.println("Enter a characetr: ");
        String letter = Sc.nextLine();
        System.out.println("Your character is: " + letter);

    }
}
