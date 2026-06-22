class Counter{
    int num = 10;
    //static int num = 10;

    void Increment(){
        num = num + 1;
    }

    public static void main(String[] args) {
        Counter num1 = new Counter();
        Counter num2 = new Counter();
        Counter num3 = new Counter();

        num1.Increment();
        num2.Increment();
        num3.Increment();

        System.out.println(num);

        //System.out.println(num1.num);
        //System.out.println(num2.num);
        //System.out.println(num3.num);
    }
}