class Worker3 implements Comparable<Worker3> {
    String name;
    Integer age;
    
    Worker3(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " - " + age;
    }

    public int compareTo(Worker3 obj) {
        // return this.age.compareTo(obj.age);
        // return obj.age.compareTo(this.age);
        // System.out.println(this.name + " ---- " + obj.name);
        return obj.name.compareTo(this.name);
    }
}
