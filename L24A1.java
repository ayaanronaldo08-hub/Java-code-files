import java.util.Scanner;
import java.util.ArrayList;

public class L24A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        System.out.println("Enter the number of arrays you want to input: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            System.out.println("Enter size of array " + (i + 1));
            int n1 = sc.nextInt();

            ArrayList<Integer> list1 = new ArrayList<>();

            System.out.println("Enter " + n1 + "elements of array " + (i+1));
            for (int j = 0; j<n1; j++){
                list1.add(sc.nextInt());
            }

            list.add(i,list1);
        }

        System.out.println("Array: " + list);

        System.out.println("Queries: ");
        int q = sc.nextInt();

        for(int i = 0; i<q; i++){
            System.out.println("Enter row:");
            int r = sc.nextInt();

            System.out.println("Enter column:");
            int c = sc.nextInt();

            try{
                System.out.println("Element at (" + r + ", " + c + "): " + list.get(r-1).get(c-1));
            } catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
