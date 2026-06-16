import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        int num1 = 0;
        int num2 = 1;
        int next = 0;

        System.out.println("Enter an integer: ");
        int num = Sc.nextInt();
      
        System.out.println(0);
        System.out.println(1);
        for (int i = 0; i < num; i++){
            next = num1 + num2;
            System.out.println(next);
            num1 = num2;
            num2 = next;
        }
    }
}

