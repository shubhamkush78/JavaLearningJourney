class Employee {
    String name;
    int age;

    public String toString() {
        return name;
    }
}

class W1 {
    public static void main(String[] args) {
        Employee x = new Employee();

        x.name = "Mohan Singh";
        x.age = 32;

        System.out.println(x);
        System.out.println(x.toString());
    }
}
