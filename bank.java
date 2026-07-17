import java.util.Scanner;

public class bank {
    public static void main(String[] args) {
        account obj1 = new account();
        try{ //tries the code that could cause an exception
            obj1.login();
        } catch (Wrong | Invalid | NotEnough ex){ //if any of these exceptions is thrown the following code runs
            //the variable "ex" stores the exception that got thrown and triggered the catch block
            System.out.println((ex.getMessage())); //uses "ex" variable to get the specific exceptions message
        }
    }
}

//following classes deifne custom exceptions
class NotEnough extends Exception { 
    public NotEnough(String message) {
        super(message);
    }
}

class Wrong extends Exception {
    public Wrong(String message){
        super(message);
    }
}

class Invalid extends Exception {
    public Invalid(String message){
        super(message);
    }
}

//account class
class account{
    double balance;
    Scanner sc = new Scanner(System.in);

    public void deposit(){
        System.out.println("Enter deposit: ");
        double deposit = sc.nextDouble();
        balance += deposit;
        System.out.println("New balance: " + (balance));
    }

    public void withdraw() throws NotEnough{ //method could throw this exception
        System.out.println("Enter withdrawal: ");
        double withdraw = sc.nextDouble();
        if (withdraw > balance){
            throw new NotEnough ("Not enough balance"); //throws the custom exception and gives it a message
        } else{
            balance -= withdraw;
            System.out.println("New balance: " + (balance));
        }
    }

    public void check(){
        System.out.println("Balance: " + balance);
    }

    public void login() throws Wrong, NotEnough, Invalid{ //method could throw all these exceptions
        System.out.println("Enter Password: ");
        String password = sc.nextLine();
        if (password.equals("12345678")){
            System.out.println("Succesful login");
            System.out.println("Enter choice(1: Deposit, 2: Withdraw, 3: Check Balance): ");
            int choice = sc.nextInt();
            if (choice == 1){
                deposit();
            } else if (choice == 2){
                withdraw();
            } else if (choice == 3){
                check();
            } else{
                throw new Invalid("Enter a valid choice"); //throws the custom exception and gives it a message
            }
        } else{
            throw new Wrong("Wrong password"); //throws the custom exception and gives it a message
        }
    }
}
