import java.io.*;

class A {
    public static void main(String[] args) throws IOException {
        Student a = new Student("Nagarjun", 12);
        Employee b = new Employee("Raga", 55, 10.09f);

        FileOutputStream fos = new FileOutputStream("bharat.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(a);
        oos.writeObject(b);

        oos.close();
    }
}
