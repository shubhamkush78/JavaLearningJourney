import java.io.*;

class A {
    public static void main(String[] args) throws IOException {
        Student a = new Student("Arjun", 9);
        Student b = new Student("Bheem", 11);
        Student c = new Student("Yudhishthir", 13);

        FileOutputStream fos = new FileOutputStream("bharat.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(a);
        oos.writeObject(b);
        oos.writeObject(c);

        oos.close();
    }
}
