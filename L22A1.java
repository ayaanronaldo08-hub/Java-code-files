import java.util.Arrays;
import java.util.Scanner;

public class L22A1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rows: ");
        int rows = sc.nextInt();

        System.out.println("Enter columns: ");
        int columns = sc.nextInt();

        int[][] array = new int[rows][columns];

        System.out.println("Add elements: ");
        for (int i = 0; i<rows; i++){
            for (int j = 0; j<columns; j++){
                int element = sc.nextInt();
                array[i][j] = element;
            }
        }

        System.out.println("Array: ");
        for (int i = 0; i<rows; i++){
            for (int j = 0; j<columns; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Enter ring number(1 = outer ring, 2 = inner ring): ");
        int s = sc.nextInt();

        System.out.println("Enter rotations: ");
        int rotation = sc.nextInt();

        int[] ringarray = getRing(s, array, rows, columns);

        System.out.println("Ring before rotation: ");
        for (int i = 0; i < ringarray.length; i++){
            System.out.println(ringarray[i] + " ");
        }
        System.out.println();

        rotate(ringarray, rotation);

        System.out.println("Ring after rotation: ");
        for (int i = 0; i < ringarray.length; i++){
            System.out.println(ringarray[i] + " ");
        }
        System.out.println();

        putRing(array, ringarray, s, rows, columns);

        System.out.println("Array after rotating: ");
        for (int i = 0; i<rows; i++){
            for (int j = 0; j<columns; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[] getRing(int ring, int[][]array, int rows, int columns){
        int rmin = ring - 1;
        int rmax = rows - ring;
        
        int cmin = ring - 1;
        int cmax = columns - ring;

        int size = 2 * ((cmax-cmin) + (rmax-rmin));

        int[] result = new int[size];

        int index = 0;

        for (int i = rmin; i <= rmax; i++){
            result[index] = array[i][cmin];
            index++;
        }

        cmin++;

        for (int j = cmin; j <= cmax; j++){
            result[index] = array[rmax][j];
            index++;
        }

        rmax--;

        for (int i = rmax; i >= rmin; i--){
            result[index] = array[i][cmax];
            index++;
        }

        cmax--;

        for (int j = cmax; j >= cmin; j--){
            result[index] = array[rmin][j];
            index++;
        }

        return result;
    }

    public static void rotate(int[] array, int rotations){
        if (rotations > array.length){
            rotations = rotations % array.length;
        }

        reverse(array, 0, array.length-1);
        reverse(array, 0, rotations-1);
        reverse(array, rotations, array.length-1);
    }

    public static void reverse(int[] array, int left, int right){
        while(left < right){
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            left++;
            right--;
        }
    }

    public static void putRing(int[][] array, int[] ringarray, int ring, int rows, int columns){
        int rmin = ring - 1;
        int rmax = rows - ring;
        
        int cmin = ring - 1;
        int cmax = columns - ring;

        int size = 2 * ((cmax-cmin) + (rmax-rmin));

        int[] result = new int[size];

        int index = 0;

        for (int i = rmin; i <= rmax; i++){
            array[i][cmin] = ringarray[index];
            index++;
        }

        cmin++;

        for (int j = cmin; j <= cmax; j++){
            array[rmax][j] = ringarray[index];
            index++;
        }

        rmax--;

        for (int i = rmax; i >= rmin; i--){
            array[i][cmax] = ringarray[index];
            index++;
        }

        cmax--;

        for (int j = cmax; j >= cmin; j--){
            array[rmin][j] = ringarray[index];
            index++;
        }

    }
}

