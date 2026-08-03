public class array {
    public static void main(String[] args) {
        int[] num = new int[10];

        for (int i = 0; i < num.length; i++){
            num[i] = i;
        }

        System.out.println(num.length);
        System.out.println(num[9]);
        System.out.println(num[0]);

        num[9] = num[1];
        num[0] = 50;
        
        System.out.println(num[9]);
        System.out.println(num[0]);

        String[] names = new String[2];

        names[0] = "Ayaan";
        names[1] = "Soham";

        System.out.println(names);
    }
}
