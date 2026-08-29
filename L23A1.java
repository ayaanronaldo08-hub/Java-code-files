import java.util.ArrayList;
import java.util.Scanner;

public class L23A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> List = new ArrayList<>();

        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();

        for(int i = 0; i<n; i++){
            System.out.println("Enter elements: ");
            int e = sc.nextInt();
            List.add(e);
        }

        System.out.println("Your list: " + List);

        ArrayList<Integer> result = new ArrayList<>();

        for(int i = List.size()-1; i>= 0; i--){
            if ((isPrime(List.get(i)) == true)){
                result.add(List.get(i));
                List.remove(i);
            }
        }

        System.out.println("Primes: " + result);
        System.out.println("Final: " + List);
    }

    public static boolean isPrime(int n){
        if (n <= 1){
            return false;
        } 

        for (int i = 2; i < n; i++){
            if (n%i == 0){
                return false;
            } 
        }   
        return true;
    }
}
