import java.util.Scanner;

public class ratingsystem {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.println("Enter movie rating: ");
        int rating = Sc.nextInt();

        if (rating > 75000) {
            System.out.println("The movie is out of this world");
        } else if ((70000 > rating) && (rating > 45000)) {
            System.out.println("The movie is the best");
        } else if (rating > 25000) {
            System.out.println("The movie could be better");
        } else if (rating > 5000) {
            System.out.println("The movie was good");
        } else {
            System.out.println("The movie was not good");
        }
    }
}
