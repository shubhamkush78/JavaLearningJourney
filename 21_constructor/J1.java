class Employee {
    String name;
    int age;

    Employee(String nm, int ag) {
        name = nm;
        age = ag;
    }
}

class J1 {
    public static void main(String[] args) {
        Employee x = new Employee("pratham", 8);

        System.out.println(x.name);
        System.out.println(x.age);
    }
}
