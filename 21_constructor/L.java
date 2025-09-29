class Employee {
    String name;
    int age;

    Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class L {
    public static void main(String[] args) {
        Employee x = new Employee("dwitiya", 10);

        System.out.println(x.name);
        System.out.println(x.age);
    }
}
