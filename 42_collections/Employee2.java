class Employee2 implements Comparable<Employee2>  {
    String name;
    int age;
    
    Employee2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + "-" + age;
    }

    public int compareTo(Employee2 obj) {
        // Employee2 e1 = this;
        // Employee2 e2 = (Employee2)obj;

        // String nm1 = e1.name;
        // String nm2 = e2.name;
        
        return this.name.compareTo(obj.name);
    }
}
