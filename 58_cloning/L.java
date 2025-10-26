class User {
    String name;
    int age;

    User(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Employee extends User implements Cloneable {
    String designation;
    int salary;

    Employee(String name, int age, String designation, int salary) {
        super(name, age);
        this.designation = designation;
        this.salary = salary;
    }

    public Employee clone() {
        Employee emp = null;

        try{
            emp = (Employee)super.clone();
        } catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return emp;
    }
}

class L {
    public static void main(String[] args) {
        Employee e = new Employee("sateesh", 34, "manager", 45000);
        Employee g = e.clone();
        
        System.out.println(e.name + " - " + e.age + " - " + e.designation + " - " + e.salary);
        System.out.println(g.name + " - " + g.age + " - " + g.designation + " - " + g.salary);
    }    
}
