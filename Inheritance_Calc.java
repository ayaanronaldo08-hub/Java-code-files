import java.util.Scanner;

class Num {
    Scanner Sc = new Scanner(System.in);

    int Getnum1(){
         System.out.println("Enter Integers: ");
         int num1 = Sc.nextInt();

         return num1;
    }

    int Getnum2(){
        Sc.nextLine();
        int num2 = Sc.nextInt();
        Sc.nextLine();
        return num2;
    }
}
 
class Function extends Num {
    int result;

    void Calculate(int num1, int num2){
        System.out.println("Enter operation(*, +, -, /): ");
        String op = Sc.nextLine();
        if (op.equals("+")){
            result = num1+num2;
        } else if (op.equals("*")){
            result = num1*num2;
        } else if (op.equals("-")){
            result = num1-num2;
        } else {
            result = num1/num2;
        }

        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {
        Function Obj1 = new Function();
        Obj1.Calculate(Obj1.Getnum1(), Obj1.Getnum2());
    }
}
