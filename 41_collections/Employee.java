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

    public boolean equals(Object obj) {
        boolean flag = false;

        if(obj != null) {
            Employee u1 = this;
            Employee u2 = (Employee)obj;

            String nm1 = u1.name;
            String nm2 = u2.name;

            flag = nm1.equals(nm2);
        }       

        return flag;
    }

}
