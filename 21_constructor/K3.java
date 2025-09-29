class Employee4 {
    String name = "Gopal";
    int age = 12;
    
    Employee4(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class K3 {
    public static void main(String[] args) {
        Employee4 x = new Employee4("indra", 100);

        System.out.println(x.name);
        System.out.println(x.age);
    }
}
