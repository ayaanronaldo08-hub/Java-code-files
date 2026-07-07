class L9A2{
    public static void main(String[] args) {
        Child obj1 = new Child();
        obj1.SayHello();
    }
}

class Parent{
    public void SayHello(){
        System.out.println("Hello from parent");
    }
}

class Child extends Parent{
    @Override
    public void SayHello(){
        System.out.println("Hello from child");
    }
}



