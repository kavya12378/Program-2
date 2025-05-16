
class student{
    String name;
    int age;
    String dob;
    student(String name,int age, String dob){
        this.name=name;
        this.age=age;
        this.dob=dob;
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("DOB: "+dob);
    }
}
public class Student{
    public static void main(String[] args){
        student s =new student("Harshita", 20, "24-08-2004");
        s.display();
    }

}