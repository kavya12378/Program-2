class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    void displayPersonName() {
        System.out.println("Name: " + name);
    }
}
class Employee extends Person {
    int empId;

    Employee(String name, int empId) {
        super(name); // calling the constructor of Person
        this.empId = empId;
    }

    void displayEmployeeDetails() {
        displayPersonName(); // inherited method from Person
        System.out.println("Employee ID: " + empId);
    }
}
public class personcls {
    public static void main(String[] args) {
        Employee e = new Employee("Kavya", 101);
        e.displayEmployeeDetails();
    }
}

