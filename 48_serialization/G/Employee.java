import java.io.Serializable;

class Employee extends User implements Serializable  { 
    String designation;
    Integer salary;

    Employee(String name, int age, String designation, Integer salary) {
        super(name, age);
        this.designation = designation;
        this.salary = salary;
    }
}
