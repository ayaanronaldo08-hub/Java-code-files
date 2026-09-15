import java.util.ArrayList;

public class ZigZag{
    public static ArrayList<Integer> zigzag(int val, int initVal){
        ArrayList<Integer> list = new ArrayList<Integer>();

        if (val < 1){
            return list;
        } else if (initVal == 1){
            list.add(1);
            list.add(1);
            list.add(1);
            return list;
        //Old code(NOT simplified)
        /* } else if (initVal == 2){ 
            list.add(2);
            list.addAll(zigzag(1,1));
            list.add(2);
            list.addAll(zigzag(1,1));
            list.add(2);
            return list;
        }
        else {
            if (val == 1){
                list.add(initVal - 1);
                list.add(initVal);
                } else if (val == 2){
                list.add(val);
                list.add(1);
                list.add(1);
                list.add(1);
                } else {
                list.add(val);
                list.add(val-1);
                list.add(1);
                list.add(1);
                list.add(1);
                }
                val--;
                list.addAll(zigzag(val, initVal));
                return list;*/
        } else {
            list.add(initVal);
            val--;
            list.addAll(zigzag(val,val));
            list.add(initVal);
            list.addAll(zigzag(val,val));
            list.add(initVal);
            return list;
        }
    }
    
    public static void main(String[] args) {
        System.out.println(zigzag(1, 1).toString());
        System.out.println(zigzag(2, 2).toString());
        System.out.println(zigzag(3, 3).toString());
        System.out.println(zigzag(4, 4).toString());
        System.out.println(zigzag(5, 5).toString());
        System.out.println(zigzag(6, 6).toString());
    }
}

    