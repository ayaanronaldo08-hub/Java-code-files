import java.util.Scanner;

public class L4A2 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.println("Enter a number 1-7: ");
        int input = Sc.nextInt();

        String Day = "No Day";
        switch(input){
            case 1:
                Day = "Monday";
                break;
            case 2: 
                Day = "Tuesday";
                break;
            case 3:
                Day = "Wednesday";
                break;
            case 4:
                Day = "Thursday";
                break;
            case 5:
                Day = "Friday";
                break;
            case 6:
                Day = "Saturday";
                break;
            case 7:
                Day = "Sunday";
                break;
            default:
                System.out.println("Invalid input");
        }
        System.out.println("The day you chose is: " + Day);
    }
}
