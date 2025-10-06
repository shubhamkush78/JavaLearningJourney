class Employee2 {
    String name;
    int age;
    
    Employee2(String name, int age) {
        this.name = name;
        this.age = age;
    } 

    public String toString() {
        return name + " - " + age;
    }

    public boolean equals(Object o) {
        Employee2 x = this;
        Employee2 y = (Employee2)o;
        
        // return x.name.equals(y.name);
        // return x.age == y.age;
        return x.name.equals(y.name) && x.age == y.age;
    }
}
