import java.util.Scanner; 

public class EvenorOdd {
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = Sc.nextInt();
        if (num%2 == 0){
            System.out.println("The number " + num + " is even");
        } else {
            System.out.println("The number " + num + " is not even");
        }
    }
}
