import java.io.*;

class B {
    public static void main(String[] args) throws IOException {
        Student a = new Student("Nakul", 8);
        Student.maxAge = 40;

        FileOutputStream fos = new FileOutputStream("b.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(a);

        oos.close();
    }
}
