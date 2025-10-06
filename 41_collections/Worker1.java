class Worker1 implements Comparable<Worker1> {
    String name;
    Integer age;
    
    Worker1(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " - " + age;
    }

    public int compareTo(Worker1 obj) {
        // String nm1 = this.name;
        // String nm2 = obj.name;

        Integer ag1 = this.age;
        Integer ag2 = obj.age;

        return ag1.compareTo(ag2);
    }
}
