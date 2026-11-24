import java.util.Scanner;

class Merger {
    public static void sort(int[] arr, int curr, int end){
        if (end <= 1){
            return;
        }

        if (curr == end - 1){
            sort(arr,0,end - 1);
            return;
        }

        if (arr[curr] > arr[curr + 1]){
            int temp = arr[curr];
            arr[curr] = arr[curr + 1];
            arr[curr + 1] = temp;
        }

        sort(arr,curr + 1,end);
    }

    public static void merge(int[] a, int i, int[] b, int j, int[] result, int k){
        if (i == a.length && j == b.length){
            return;
        }

        if (j == b.length || (i < a.length && a[i] <= b[j])){
            result[k] = a[i];
            merge(a,i + 1,b,j,result,k + 1);
        }
        else{
            result[k] = b[j];
            merge(a,i,b,j + 1,result,k + 1);
        }
    }

    public static int[] readArray(Scanner sc){
        String[] parts = sc.nextLine().trim().split(" +");
        int[] arr = new int[parts.length];

        for (int i = 0; i < parts.length; i++){
            arr[i] = Integer.parseInt(parts[i]);
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = readArray(sc);
        int[] b = readArray(sc);

        sort(a,0,a.length);
        sort(b,0,b.length);

        int[] result = new int[a.length + b.length];
        merge(a,0,b,0,result,0);

        for (int i = 0; i < result.length; i++){
            if (i > 0){
                System.out.print(" ");
            }
            System.out.print(result[i]);
        }
        System.out.println();
    }
} 
