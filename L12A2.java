import java.util.Scanner;

public class L12A2 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        try{
            int x = Sc.nextInt();
            int y = Sc.nextInt();
            int z = x/y;
            System.out.println("Result: " + z);
        } catch(ArithmeticException ex){
            System.out.println("Catch Block: ");
            System.out.println(ex);
        } finally{
            System.out.println("Done");
        }
    }
}
