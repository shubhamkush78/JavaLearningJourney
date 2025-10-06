class Company2 implements Comparable {
    String name;
    Integer age;
    
    Company2(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " - " + age;
    }

    public int compareTo(Object obj) {
        Company2 c1 = this;
        Company2 c2 = (Company2)obj;

        // String nm1 = c1.name;
        // String nm2 = c2.name;

        Integer ag1 = c1.age;
        Integer ag2 = c2.age;

        return ag1.compareTo(ag2);
    }
}