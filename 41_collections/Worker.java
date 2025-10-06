class Worker implements Comparable<Worker> {
    String name;
    int age;
    
    Worker(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " - " + age;
    }

    public int compareTo(Worker obj) {
        // Worker c1 = this;
        // Worker c2 = (Worker)obj;

        String nm1 = this.name;
        String nm2 = obj.name;

        return nm1.compareTo(nm2);
    }
}
