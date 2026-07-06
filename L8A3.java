class Mammal {
    void mam(){
        System.out.println("Object is a Mammal");
    }
}

class Lion extends Mammal{
    void Roar(){
        System.out.println("The Lion roars");
    }
}

class Human extends Mammal{
    void Species(){
        System.out.println("Human is a Mammal");
    }

    public static void main(String[] args) {
        Lion obj = new Lion();
        obj.Roar();
        obj.mam();
    }
}