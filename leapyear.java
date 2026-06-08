import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = Sc.nextInt();
        Boolean result = (year%4==0)?true:false;
        System.out.println("The year " + year + " is a leap year: " + result);
    }
}
