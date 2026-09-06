import java.util.Scanner;

public class L25A2 {
    public static int fact(int x){
        if ((x == 1) || (x == 0)){
            return x;
        } else {
            return x * fact(x-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter x: ");
        int x = sc.nextInt();

        System.out.println(fact(x));
    }
}
