import java.util.Scanner;
import java.util.ArrayList;

public class arrayList{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter number of elements in list: ");
        int n = sc.nextInt();

        System.out.println("Enter integers of list: ");

        for(int i = 0; i<n; i++){
            list.add(sc.nextInt());
        }

        System.out.println("Your list: " + list);

        System.out.println("Enter query(1 or 2): ");
        int q = sc.nextInt();

        if (q == 1){
            System.out.println("Enter element you want to add: ");
            int r = sc.nextInt();
            System.out.println("Enter index you want to add it at: ");
            int p = sc.nextInt();

            list.add(p, r);

            System.out.println("Updated list: " + list);
        } else if (q == 2){
            System.out.println("Enter target: ");
            int p = sc.nextInt();
            
            System.out.println(p + " was found last at index: " + list.lastIndexOf(p));
        }
    }
}