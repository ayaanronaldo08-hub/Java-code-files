interface myInterface {
    public void method1();

    public void method2();
}

class L12A1 implements myInterface{
    public void method1(){
        System.out.println("method1");
    }

    public void method2(){
        System.out.println("method2");
    }
    public static void main(String[] args) {
        L12A1 obj = new L12A1();

        obj.method1();
        obj.method2();
    }
}