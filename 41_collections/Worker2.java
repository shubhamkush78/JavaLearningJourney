class Worker2 implements Comparable<Worker2> {
    String name;
    Integer age;
    
    Worker2(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " - " + age;
    }

    public int compareTo(Worker2 obj) {
        return this.age.compareTo(obj.age);
        // return this.name.compareTo(obj.name);
    }
}
