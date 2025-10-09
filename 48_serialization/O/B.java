import java.io.*;

class B {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("bharat.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Student x = (Student)ois.readObject();
        Employee y = (Employee)ois.readObject();

        System.out.println(x);
        System.out.println(y);

        ois.close();
    }
}
