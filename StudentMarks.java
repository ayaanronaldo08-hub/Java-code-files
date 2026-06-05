import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter Math grade: ");
        double math = Sc.nextDouble();
        System.out.println("Enter English grade: ");
        double english = Sc.nextDouble();
        System.out.println("Enter Science grade: ");
        double science = Sc.nextDouble();
        double average = (math + english + science)/3.0;
        System.out.println("The average is: " + average);
    }
}
