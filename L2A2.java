public class L2A2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        
        System.out.println("Initial Values: " + a);
        System.out.println("Initial Values: " + b);

        System.out.println("Uninary(Post increment): " + (a++));
        System.out.println("Uninary(Pre increment): " + (++b));

        System.out.println("Binary 10+5: " + 10 + 5);
        System.out.println("Binary 10 + 5: " + (10+5));
        System.out.println(10+5 + " = 15");

        int increment = a++ * ++b;
        System.out.println(increment);
        System.out.println("Current Value of a: " + a);
        System.out.println("Current Value of b: " + b);

        System.out.println("Ternary Operators: ");
        int largest = (a>b)?a:b;
        System.out.println("The largest between a and b is: " + largest);

    }
}
