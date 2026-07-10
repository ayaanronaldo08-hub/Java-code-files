
class Shape {
    public double getArea(){
        return 0;
    }
}

class Square extends Shape{
    private double Side;
    public Square (double Side){
        this.Side = Side;
    }
    public double getArea(){
        return Side * Side;
    }
}

class Triangle extends Shape{
    private double height;
    private double base;
    public Triangle(double height, double base){
        this.height = height;
        this.base = base;
    }
    public double getArea(){
        return 0.5*base*height;
    }
}

public class L10A2{
    public static void main(String[] args) {
        Shape shape[] = new Shape[2];

        shape[0] = new Square(5);
        shape[1] = new Triangle(4, 3);

        System.out.println("The area of a square is: " + shape[0].getArea());
        System.out.println("The area of a triangle is: " + shape[1].getArea());
    }
}
