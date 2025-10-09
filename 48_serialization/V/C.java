import java.io.*;

class C {
    public static void main(String[] args) throws IOException {
        Student a = new Student("Sahdev", 7);
        Student.maxAge = 50;

        FileOutputStream fos = new FileOutputStream("c.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(a);

        oos.close();
    }
}
