class Superclass {
    int num = 10;
    void display(){
        System.out.println(num);
    }
}
class child extends Superclass{
    int num = 50;
    void display(){
        System.out.println(super.num);
    }
}

class L9A3{
    public static void main(String[] args) {
        child obj = new child();
        obj.display();
    }
}