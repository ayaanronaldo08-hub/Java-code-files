class Employee{
    int employee_num;
    String name;
    float salary;

    Employee(){
        System.out.println("********");
        employee_num = 1;
        name = "Ayaan";
        salary = 4500f;
    }

    void display(){
        System.out.println(employee_num + " | " + name + " | " + salary);
    }
}

public class L7A1 {
    public static void main(String[] args) {
        Employee Employee_1 = new Employee();
        Employee Employee_2 = new Employee();
        Employee Employee_3 = new Employee();

        Employee_1.display();
        Employee_2.display();
        Employee_3.display();
    }
}
