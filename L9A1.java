class Student {
    int id;
    String name;
    float stipend;

    Student(){}

    Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    Student(int id, String name, float stipend){
        this.id = id;
        this.name = name;
        this.stipend = stipend;
    }

    void display(){
        System.out.println(this.id + " | " + this.name + " | " + this.stipend);
    }
}

class Main{
    public static void main(String[] args) {
        Student st1 = new Student();
        Student st2 = new Student(10, "Ayaan");
        Student st3 = new Student(11, "Milo", 40);

        st1.display();
        st2.display();
        st3.display();
    }
}
