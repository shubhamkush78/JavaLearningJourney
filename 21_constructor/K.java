class Employee1 {
    String name;
    int age;

    Employee1(String nm, int ag) {
        System.out.print("parameter var. nm: " + nm);
        System.out.println("\tparameter var. ag: " + ag);
        System.out.print("instance var name: " + name);
        System.out.println("\tinstance var age: " + age);
    }
}

class K {
    public static void main(String[] args) {
        Employee1 x = new Employee1("indra", 100);

        System.out.println(x.name);
        System.out.println(x.age);
    }
}
