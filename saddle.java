import java.util.Random;
import java.util.Scanner;

public class saddle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();

        int[][] arr = new int[n][n];

        Random rand = new Random();
    
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                arr[i][j] = rand.nextInt(1,51);
            }
        }

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print(arr[i][j] + ", ");
            }
            System.out.println();
        }

        int sadprice = findSaddle(n, arr);

        System.out.println(sadprice);
    }

    public static int findSaddle(int n, int[][] array){
    for (int i = 0; i < n; i++){
        int min = Integer.MAX_VALUE;
        int column = 0;

        for (int j = 0; j < n; j++){
            if (array[i][j] < min){
                min = array[i][j];
                column = j;
            }
        }

        boolean saddle = true;

        for (int k = 0; k < n; k++){
            if (array[k][column] > min){
                saddle = false;
                break;
            }
        }

        if (saddle){
            return min;
        }
    }

    return 0;
}
}