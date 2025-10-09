import java.io.*;

class A {
    public static void main(String[] args) throws IOException {
        Employee e = new Employee("raga", 55, "manager", 15000);

        new ObjectOutputStream(new FileOutputStream("golu.txt")).writeObject(e);
    }
}
