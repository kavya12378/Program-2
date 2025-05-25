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
    String department;

    Employee(String name, int empId, String department) {
        super(name);
        this.empId = empId;
        this.department = department;
    }

    void displayEmployeeDetails() {
        displayPersonName();
        System.out.println("Employee ID: " + empId);
        System.out.println("Department: " + department);
    }
}

public class personcls {
    public static void main(String[] args) {
        Employee e = new Employee("Kavya", 101, "HR");
        e.displayEmployeeDetails();
    }
}
