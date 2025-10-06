class Company implements Comparable {
    String name;
    int age;
    
    Company(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " - " + age;
    }

    public int compareTo(Object obj) {
        Company c1 = this;
        Company c2 = (Company)obj;

        String nm1 = c1.name;
        String nm2 = c2.name;

        return nm1.compareTo(nm2);
    }
}
