class Employee2 {
    String name;
    int age;

    Employee2(String nm, int ag) {
        System.out.print("parameter var. nm: " + nm);
        System.out.println("\tparameter var. ag: " + ag);
        System.out.print("instance var name: " + name);
        System.out.println("\tinstance var age: " + age);
        System.out.print("instance var name: " + this.name);
        System.out.println("\tinstance var age: " + this.age);
    }
}

class K1 {
    public static void main(String[] args) {
        Employee2 x = new Employee2("indra", 100);

            System.out.println(x.name);
            System.out.println(x.age);
    }
}
