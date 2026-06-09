import java.util.Scanner;

public class electricty_bill {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        
        System.out.println("Enter how many units you have used: ");
        Double Units = Sc.nextDouble();

        Double Price = 0.0;
        Double Tax;

        if (Units<=25){
            Tax = 5.0;
            Price = Units * 10 + Tax;
        } else if ((Units>25) && (Units<=30)){
            Tax = 6.0;
            Price = Units * 15 + Tax;
        } else if ((Units>30) && (Units<=45)){
            Tax = 6.5;
            Price = Units * 20 + Tax;
        } else{
            Tax = 7.0;
            Price = Units * 25 + Tax;
        }
        System.out.println("Your bill is: " + Price);
    }
}
