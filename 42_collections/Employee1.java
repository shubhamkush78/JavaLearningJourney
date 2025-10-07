class Employee1 implements Comparable  {
    String name;
    int age;
    
    Employee1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + "-" + age;
    }

    public int compareTo(Object obj) {
        Employee1 e1 = this;
        Employee1 e2 = (Employee1)obj;

        String nm1 = e1.name;
        String nm2 = e2.name;
        
        return nm1.compareTo(nm2);
    }
}
