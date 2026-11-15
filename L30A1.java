import java.util.*;

class L30A1{
    public static int BinarySearch(int[] array, int target, int check){
        int[] subarr = new int[0];

        if (array.length == 1){
            return array[check];
        }

        if (target == array[check]){
            return array[check];
        } else if (target > array[check]){
            subarr = Arrays.copyOfRange(array, check, array.length);
            check = subarr.length/2;
            BinarySearch(subarr, target, check);
        } else {
            subarr = Arrays.copyOfRange(array, 0, check);
            check = subarr.length/2;
            BinarySearch(subarr, target, check);
        }
        
        return subarr[check];
    }

    public static int findIndex(int[] array, int target){
        for (int i = 0; i < array.length; i++){
            if (array[i] == target){
                return i;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements in ascending order:");
        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Array: " + Arrays.toString(arr));

        System.out.println("Enter target: ");
        int target = sc.nextInt();

        System.out.println("Found target at index: " + findIndex(arr,BinarySearch(arr, target, arr.length/2)));
    }
}