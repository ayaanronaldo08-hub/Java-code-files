class Pet {
    String name = "Milo";
    void Species(String Species){
        System.out.println("The pet is a " + Species);
    }
}

class Dog extends Pet{
    void Breed(String Breed){
        System.out.println("It is a " + Breed);
    }
}

class Puppy extends Dog{
    void Age(int Age){
        System.out.println("It is " + Age + " years old");
    }
    void Name(String name){
        System.out.println("His name is " + name);
    }

    public static void main(String[] args) {
        Puppy Milo = new Puppy();
        Milo.Species("Dog");
        Milo.Breed("Golden Retriver");
        Milo.Age(1);
        Milo.Name(Milo.name);
    }
}

