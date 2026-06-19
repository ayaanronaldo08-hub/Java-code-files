import java.util.Scanner;

public class L6A1 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.println("Enter the amount of test case: ");
        int t = Sc.nextInt();

        for(int i = 1; i <= t; i++){
            System.out.println("Enter a number: ");
            int num = Sc.nextInt();

            int counter = 0;
            for(int div = 2; div*div <= num; div++){
                if (num % div == 0){
                    counter = counter + 1;
                    System.out.println("Counter: " + counter);
                    break;
                }}
                
            if (num <=1 || counter == 0){
                System.out.println("Prime");
            }  else{
                System.out.println("Not Prime");
            }
             
        }

    }
}
