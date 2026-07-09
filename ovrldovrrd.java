import java.util.Scanner;

class Parent {
    Scanner Sc = new Scanner(System.in);

    int num(){
        System.out.println("enter int: ");
        int num = Sc.nextInt();
        return num;
    }

    String num(double num){
        return ("Double: " + num);
    }

    public void Hello(){
        System.out.println("Hello from parent");
    }
}

class Child extends Parent{
    @Override
    public void Hello(){
        System.out.println("Hello from child");
    }
}

class ovrldovrrd{
    public static void main(String[] args) {
        Parent obj1 = new Parent();
        Child obj2 = new Child();

        System.out.println(obj1.num());
        System.out.println(obj1.num(5.0));
        obj1.Hello();

        obj2.Hello();
    }
}