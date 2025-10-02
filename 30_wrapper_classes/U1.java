class Employee {
    String name;
    int age;

    public boolean equals(Object o) {
        return this.name.equals(((Employee)o).name) && this.age==((Employee)o).age;
    }
}

class U1 {
    public static void main(String[] args) {
        Employee x = new Employee();
        x.name = "om";
        x.age = 23;

        Employee y = new Employee();
        y.name = "om";
        y.age = 23;

        System.out.println(x == y);
        System.out.println(x.equals(y));
    }
}
