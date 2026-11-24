import java.util.Scanner;

class Denominations {
    public static void findNearest(int[] arr, int target){
        int low = 0;
        int high = arr.length - 1;
        int floor = -1;
        int ceil = -1;

        while (low <= high){
            int mid = (low + high) / 2;

            if (arr[mid] == target){
                System.out.println(arr[mid]);
                return;
            }
            else if (arr[mid] < target){
                floor = arr[mid];
                low = mid + 1;
            }
            else{
                ceil = arr[mid];
                high = mid - 1;
            }
        }

        System.out.println(ceil + " and " + floor);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        findNearest(arr,target);
    }
}