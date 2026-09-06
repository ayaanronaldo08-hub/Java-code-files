public class L25A1 {
    public static int reversecnt(int x){
        if (x == 0){
            return x;
        } else {
            System.out.println(x);
            return reversecnt(x-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(reversecnt(10));
    }
}
