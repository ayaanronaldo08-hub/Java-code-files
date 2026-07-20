//Consider the following class: public class Book { private String title; private String author; private int numPages; public Book(String t, String a, int np) { title = t; author = a; numPages = np; } public String getTitle() { return title; } public String getAuthor() { return author; } public int getNumPages() { return numPages; } } 
// Write a constructor for a subclass of Person called Student that takes three parameters: a name, an age, and a major. The Student class should have an additional method called getMajor() that returns the student's major.
import java.util.Scanner;

public class L13A1 {
    public static void main(String[] args) {
        Book obj1 = new Book("Harry Potter", "JK rowling", 150);
        System.out.println("Title: " + obj1.getTitle());
        System.out.println("Author: " + obj1.getAuthor());
        System.out.println("Number of pages: " + obj1.getNum());

        Student obj2 = new Student("Ayaan", 17, "Comp Sci");
        System.out.println("Name: " + obj2.getName());
        System.out.println("Name: " + obj2.getAge());
        System.out.println("Name: " + obj2.getMajor());

        //Person obj3 = new Person("Ayaan", 17);
        Student obj3 = new Student("Soham", 12, "N/A");
        System.out.println("Name: " + obj3.getName());
        System.out.println("Name: " + obj3.getAge());
        System.out.println("Name: " + obj3.getMajor());
        
    }
}

class Book{
    Scanner sc = new Scanner(System.in);
    private String t;
    private String a;
    private int numP;

    Book(String title, String author, int number){
        t = title;
        a = author;
        numP = number;
    }

    public String getTitle(){
        return t;
    }

    public String getAuthor(){
        return a;
    }

    public int getNum(){
        return numP;
    }
}

class Person{
    private String Name;
    private int age;

    Person(String Name, int age){
        this.Name = Name;
        this.age = age;
    }

    public String getName(){
        return Name;
    }

    public int getAge(){
        return age;
    }
}

class Student extends Person{
    private String major;

    public Student(String Name, int age, String major){
        super(Name, age);
        this.major = major;
    }

    public String getMajor(){
        return major;
    }
}
