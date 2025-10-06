class Student1 {
    String name;
    int age;
    
    Student1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " - " + age;
    }

    public boolean equals(Object obj) {
        boolean flag = false;

        if(obj != null) {
            Student1 u1 = this;
            Student1 u2 = (Student1)obj;

            String nm1 = u1.name;
            String nm2 = u2.name;

            flag = nm1.equals(nm2);
        }       

        return flag;
    }

}
