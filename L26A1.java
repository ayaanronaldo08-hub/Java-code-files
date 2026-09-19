import java.util.Scanner;

class L26A1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter base: ");
        int base = sc.nextInt();
        
        System.out.println("Enter exponent: ");
        int exponent = sc.nextInt();
        
        System.out.println(exp(base,exponent));
    }

    public static int exp(int x, int n){
        if (n == 0){
            return 1;
        }

        int result = exp(x, n/2);

        int finalResult = result * result;

        if (n%2 == 1){
            finalResult *= x;
        }

        return finalResult;
    }
}