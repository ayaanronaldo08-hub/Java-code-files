import java.util.ArrayList;

public class digitsproject {
    public static void main(String[] args) {
        Digit obj1 = new Digit(10);
        obj1.display();
    }
}

class Digit{
    ArrayList<Integer> digitList;

    public Digit(int num)

    {

    digitList = new ArrayList<Integer>();

    if (num == 0)

    {

    digitList.add(0);

    }



    while (num > 0)

    {

    digitList.add(num%10);

    num /= 10;

    }

    } 

    public void display(){
        System.out.println("List: " + digitList);
    }
}