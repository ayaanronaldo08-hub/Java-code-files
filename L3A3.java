import java.util.Scanner;

public class L3A3 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.println("Enter your grade: ");
        Double Score = Sc.nextDouble();
        String Grade;

        if (Score > 90){
            Grade = "O";
        } else if ((Score > 80) && (Score <= 90)){
            Grade = "A+";
        } else if ((Score <= 80) && (Score > 70)){
            Grade = "A";
        } else if ((Score <= 70) && (Score > 60)){
            Grade = "B";
        } else{
            Grade = "C";
        }
        
        System.out.println("Your grade in the class is: " + Grade);
    }
}
