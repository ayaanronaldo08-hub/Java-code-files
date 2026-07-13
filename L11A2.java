abstract class Objects{
    abstract void showShape();

    public void Shape(){
        System.out.println("Hello from Abstract class");
    }
}

class Triangle extends Objects{
    public void showShape(){
        System.out.println("This is a triangle");
    }
}

class Cuboid extends Objects{
    public void showShape(){
        System.out.println("This is a cuboid");
    }
}

class Sphere extends Objects{
    public void showShape(){
        System.out.println("This is a sphere");
    }
}

public class L11A2 {
    public static void main(String[] args) {
        Objects obj1 = new Triangle();
        Objects obj2 = new Cuboid();
        Objects obj3 = new Sphere();

        obj1.Shape();
        obj1.showShape();

        obj2.Shape();
        obj2.showShape();

        obj3.Shape();
        obj3.showShape();
    }
}
