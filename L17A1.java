import java.util.ArrayList;

public class L17A1 {
    public static void main(String[] args) {
        Course Math = new Course("Math", 1, 90);
        Course English = new Course("English", 1, 85);
        Course Science = new Course("Science", 1, 80);

        Student Ayaan = new Student("Ayaan", 1);

        Ayaan.addCourse(Math);
        Ayaan.addCourse(English);
        Ayaan.addCourse(Science);

        System.out.println("Name: " + Ayaan.getName() + " | " + "ID: " + Ayaan.getID());
        System.out.println("Grades: ");
        System.out.println(Math.getName() + " | " + "Credits: " + Math.getCredit() + " | " + "Grade: " + Math.getGrade());
        System.out.println(English.getName() + " | " + "Credits: " + English.getCredit() + " | " + "Grade: " + English.getGrade());
        System.out.println(Science.getName() + " | " + "Credits: " + Science.getCredit() + " | " + "Grade: " + Science.getGrade());
        System.out.println("GPA: " + Ayaan.getGPA());
    }
}

class Student{
    private String name;
    private int id;
    private ArrayList<Course> courses;

    public Student(String name, int id){
        this.name = name;
        this.id = id;
        courses = new ArrayList<Course>();
    }

    public void addCourse(Course course){
        courses.add(course);
    }

    public String getName(){
        return name;
    }

    public int getID(){
        return id;
    }

    public ArrayList<Course> getCourses(){
        return courses;
    }

    public double getGPA(){
        double total = 0;
        int count = 0;
        Course course;

        for(int i = 0; i < courses.size(); i++){
            count = i;
            course = courses.get(i);
            total += course.getGrade();
        }

        return (total/count);
    }
}

class Course{
    private String name;
    private double credits;
    private double grade;

    public Course(String name, double credits, double grade){
        this.name = name;
        this.credits = credits;
        this.grade = grade;
    }

    public double getGrade(){
        return grade;
    }

    public double getCredit(){
        return credits;
    }

    public String getName(){
        return name;
    }
}