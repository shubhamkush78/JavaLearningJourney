import java.io.*;

class A {
    public static void main(String[] args) throws IOException {
        Student a = new Student("Arjun", 9);
        Student.maxAge = 30;

        FileOutputStream fos = new FileOutputStream("a.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(a);

        oos.close();
    }
}
