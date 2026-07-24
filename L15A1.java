public class L15A1 {
    public static void main(String[] args) {
        Dog obj1 = new Dog("Milo", 5, "Golden Retriever");

        System.out.println("Name: " + obj1.getName());
        System.out.println("Age: " + obj1.getAge());
        System.out.println("Breed: " + obj1.getBreed());
        obj1.makeSound();

        Cat obj2 = new Cat("Minnie", 4, false);
        System.out.println("Name: " + obj2.getName());
        System.out.println("Age: " + obj2.getAge());
        System.out.println("Is indoors: " + obj2.getIndoors());
        obj2.makeSound();
    }
}

class Animal{
    private String name;
    private int age;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void makeSound(){
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal{
    private String breed;

    public Dog(String name, int age, String breed){
        super(name, age);
        this.breed = breed;
    }

    public String getBreed(){
        return breed;
    }

    public void makeSound(){
        System.out.println("Bark");
    }
}

class Cat extends Animal{
    private boolean isIndoors;

    public Cat(String name, int age, boolean isIndoors){
        super(name, age);
        this.isIndoors = isIndoors;
    }

    public boolean getIndoors(){
        return isIndoors;
    }

    public void makeSound(){
        System.out.println("Meow");
    }
}