class Employee1 {
    String name;
    int age;
    
    Employee1(String name, int age) {
        this.name = name;
        this.age = age;
    } 

    public String toString() {
        return name + " - " + age;
    }

    public boolean equals(Object o) {
        Employee1 x = this;
        Employee1 y = (Employee1)o;
        
        // return x.name.equals(y.name);
        return x.age == y.age;
    }
}
