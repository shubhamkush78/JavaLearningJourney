class Employee {
    String name;
    int age;
    
    Employee(String name, int age) {
        this.name = name;
        this.age = age;
    } 

    public String toString() {
        return name + " - " + age;
    }

    public boolean equals(Object o) {
        Employee x = this;
        Employee y = (Employee)o;
        System.out.println(x.name + " ------ " + y.name);
        return x.name.equals(y.name);
    }
}
