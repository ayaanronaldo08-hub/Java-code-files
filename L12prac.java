import java.util.Scanner;

interface remotecontrol {
    public void turnon();

    public void turnoff();
}

class TV implements remotecontrol{
    public void turnon(){
        System.out.println("TV is on");
    }

    public void turnoff(){
        System.out.println("TV is off");
    }
}

class AC implements remotecontrol{
    public void turnon(){
        System.out.println("AC is on");
    }

    public void turnoff(){
        System.out.println("AC is off");
    }
}

class L12prac{
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        TV obj1 = new TV();
        AC obj2 = new AC();

        System.out.println("What do you want to turn on. 1. AC. 2. TV");
        int decision = Sc.nextInt();
        Sc.nextLine();
        
        if (decision == 1){
            obj2.turnon();
            System.out.println("Do you want to turn it off? A = Yes, B = No.");
            char choice = Sc.next().charAt(0);
            if (choice == 'A'){
                obj2.turnoff();
            }
        } else{
            obj1.turnon();
            System.out.println("Do you want to turn it off? A = Yes, B = No.");
            char choice = Sc.next().charAt(0);
            if (choice == 'A'){
                obj1.turnoff();
            }
        }
    }
}
