import java.util.Scanner;

public class L3A2 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.println("Enter an number: ");
        Double num = Sc.nextDouble();
        if (num > 10){
            System.out.println("I am greater than 10");
        } else {
            System.out.println("I am not greater than 10");
        }
    }
}
