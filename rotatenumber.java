import java.util.Scanner;

public class rotatenumber {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        String num = Sc.nextLine();

        System.out.println("How many numbers do you want to send from back to front: ");
        int amount = Sc.nextInt();
  
        String attach = "";

        for (int k = num.length()-amount; k <= num.length()-1; k++){
            attach = attach + num.charAt(k);
        }

        num = num.substring(0, num.length()-amount);

        System.out.println("Final result: " + attach + num);
    }
}
