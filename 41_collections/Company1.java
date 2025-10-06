class Company1 implements Comparable {
    String name;
    int age;
    
    Company1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " - " + age;
    }

    public int compareTo(Object obj) {
        Company1 c1 = this;
        Company1 c2 = (Company1)obj;

        // String nm1 = c1.name;
        // String nm2 = c2.name;

        int ag1 = c1.age;
        int ag2 = c2.age;

        return ag1.compareTo(ag2);
    }
}

// Company1.java:24: error: int cannot be dereferenced
//         return ag1.compareTo(ag2);
//                   ^
// 1 error
