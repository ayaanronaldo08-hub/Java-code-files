import java.util.Scanner;

class L27A1{
    public static void toh(int n, int t1, int t2, int t3){
        if (n == 0){
            return;
        }

        toh(n-1, t1, t3, t2);

        System.out.println("Move " + n + " from " + t1 + " to " + t2);

        toh(n-1, t3, t2, t1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of disks: ");
        int n = sc.nextInt();

        System.out.println("Enter t1 number: ");
        int t1 = sc.nextInt();

        System.out.println("Enter t2 number: ");
        int t2 = sc.nextInt();

        System.out.println("Enter t3 number: ");
        int t3 = sc.nextInt();

        toh(n, t1, t2, t3);
    }
}