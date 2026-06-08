public class L2A2 {
    public static void main(String[] args) {
        int a = 5;
        int b = 4;

        int sum = a + b;
        int diff = a - b;
        int mult = a * b;
        double div = a/b;

        String magic = "=======Magic=======";

        System.out.println("=======Method 1=======");
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
        System.out.println("Multiplication: " + mult);
        System.out.println("Division: " + div);
        
        System.out.println("=======Method 2=======");
        System.out.println("Sum: " + (a+b));
        System.out.println("Difference: " + (a-b));
        System.out.println("Multiplication: " + (a*b));
        System.out.println("Division: " + (a/b));

        System.out.println("=======Method 3=======");
        System.out.println(
            "Sum: " + sum +
            " Difference: " + diff +
            " Multiplication: " + mult +
            " Division: " + div
        );

        System.out.println(magic);
    }
}
