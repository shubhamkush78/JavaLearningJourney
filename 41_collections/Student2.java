class Student2 {
    String name;
    int age;
    
    Student2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " - " + age;
    }

    public boolean equals(Object obj) {
        boolean flag = false;

        if(obj != null) {
            if(obj instanceof Student2) {
                Student2 u1 = this;
                Student2 u2 = (Student2)obj;
    
                String nm1 = u1.name;
                String nm2 = u2.name;
    
                flag = nm1.equals(nm2);
            }
        }       

        return flag;
    }
}
