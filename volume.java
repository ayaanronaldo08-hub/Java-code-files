public class volume {
    public double getVolume(){
        return 0;
    }
    public static void main(String[] args) {
        Cuboid obj1 = new Cuboid(10, 10, 10);
        System.out.println("Volume of cuboid: " + obj1.getVolume());

        Cylinder obj2 = new Cylinder(20, 8);
        System.out.println("Volume of cylinder: " + obj2.getVolume());

        Cube obj3 = new Cube(5);
        System.out.println("Volume of cube: " + obj3.getVolume());
    }
}

class Cuboid extends volume{
    private double length;
    private double height;
    private double width;

    public Cuboid(double length, double height, double width){
        this.length = length;
        this.height = height;
        this.width = width;
    }

    public double getVolume(){
        return (length * width * height);
    }
}

class Cylinder extends volume{
    private double radius;
    private double height;

    public Cylinder(double radius, double height){
        this.radius = radius;
        this.height = height;
    }
    
    public double getVolume(){
        return (3.14 * radius * radius * height);
    }
}

class Cube extends volume{
    private double side;

    public Cube(double side){
        this.side = side;
    }

    public double getVolume() {
        return (side * side * side);
    }
}
