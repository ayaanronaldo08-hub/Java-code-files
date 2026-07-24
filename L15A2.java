public class L15A2 {
    public static void main(String[] args) {
        Car obj1 = new Car("Mercedes", "S class", 2026, 4);
        System.out.println("Make: " + obj1.getMake());
        System.out.println("Model: " + obj1.getModel());
        System.out.println("Year: " + obj1.getYear());
        System.out.println("Doors: " + obj1.getDoors());
        obj1.drive();

        Truck obj2 = new Truck("Volve", "Semi", 2025, 1900);
        System.out.println("Make: " + obj2.getMake());
        System.out.println("Model: " + obj2.getModel());
        System.out.println("Year: " + obj2.getYear());
        System.out.println("Payload: " + obj2.getPayload());
        obj2.drive();
    }
}

abstract class Vehicle{
    private String model;
    private String make;
    private int year;

    public Vehicle(String model, String make, int year){
        this.model = model;
        this.make = make;
        this.year = year;
    }

    String getModel(){
        return model;
    };

    String getMake(){
        return make;
    };

    int getYear(){
        return year;
    };

    abstract void drive();
}

class Car extends Vehicle{
    private int numDoors;

    public Car(String make, String model, int year, int numDoors){
        super(make, model, year);
        this.numDoors = numDoors;
    }

    public int getDoors(){
        return numDoors;
    }

    public void drive(){
        System.out.println("Driving car");
    }
}

class Truck extends Vehicle{
    private double payload;

    public Truck(String make, String model, int year, double payload){
        super(make, model, year);
        this.payload = payload;
    }

    public double getPayload(){
        return payload;
    }

    public void drive(){
        System.out.println("Driving Truck");
    }
}