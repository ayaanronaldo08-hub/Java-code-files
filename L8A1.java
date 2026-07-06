class Parent {
    int age;
    int id;
    String name;

    void name(String name){
        System.out.println("Name: " + name);
    }
}

class Child extends Parent{
    void age(int age){
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Child student = new Child();
        student.age(17);
        student.name("Ayaan");
    }
}

