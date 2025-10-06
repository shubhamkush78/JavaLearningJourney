class Employer {
    String name;
    int age;
    
    Employer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " - " + age;
    }

    public boolean equals(Object obj) {
        boolean flag = false;

        if(obj != null) {
            if(obj instanceof Employer) {
                Employer u1 = this;
                Employer u2 = (Employer)obj;
    
                String nm1 = u1.name;
                String nm2 = u2.name;

                System.out.println("~~~~~~~~~~~~~");
    
                flag = nm1.equals(nm2);
            }
        }       

        return flag;
    }
}
