import java.io.*;

class A {
    public static void main(String[] args) throws IOException {
        Employee e = new Employee("yam", 99, "death", 100);

        System.out.println(e.name);
        System.out.println(e.age);
        System.out.println(e.designation);
        System.out.println(e.salary);

        new ObjectOutputStream(new FileOutputStream("golu.txt")).writeObject(e);
    }
}
