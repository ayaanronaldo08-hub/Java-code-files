import java.util.ArrayList;
import java.util.Scanner;

public class SwapList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements:");
        int n = sc.nextInt();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++){
            list.add(sc.nextInt());
        }

        System.out.println("1st and last swapped: " + swap(list, n));

        sc.close();
    }

    public static ArrayList<Integer> swap(ArrayList<Integer> list, int n){
        int temp = list.get(0);
        list.set(0, list.get(n-1));
        list.set((n-1), temp);

        return list;
    }
}


