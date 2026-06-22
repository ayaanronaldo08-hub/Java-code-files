import java.util.Scanner; //imports scanner

class student{ //creates "student" class
    static Scanner Sc = new Scanner(System.in); //creates static scanner varaiable to make it global and allow to be accessed anywhere to display an accurate count

    String name; //initialize student name var
    int age; //initialize student age var
    int idnum; //initialize student id number var
    int counter = 0; //intiialize student count var

    student(){ //student constructor. each object of the class gets this.
        System.out.println("Enter name: ");
        name = Sc.nextLine();

        if (name.equals("n/a")){ //if user enters name as "n/a" following code runs
            age = 0;
            idnum = 0;
        } else{
            System.out.println("Enter age: ");
            age = Sc.nextInt();

            Sc.nextLine();

            System.out.println("Enter id number: ");
            idnum = Sc.nextInt();

            counter += 1;
        }
    }

    void display(){ //display all info
        System.out.println("Name: " + name + " | " + "Age: " + age + " | " + "Id number: " + idnum + " | " + "Count: " + counter);
    }

    public static void main(String[] args) {
        student stu1 = new student(); //creates object and assigns it to class. 
        stu1.display(); //displays info of the object

        student stu2 = new student(); //creates object and assigns it to class. 
        stu2.display(); //displays info of the object

        student stu3 = new student(); //creates object and assigns it to class. 
        stu3.display(); //displays info of the object
    }
}
