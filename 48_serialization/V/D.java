import java.io.*;

class D {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        
        ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("a.txt"));
        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("b.txt"));
        ObjectInputStream ois3 = new ObjectInputStream(new FileInputStream("c.txt"));

        Student x = (Student)ois1.readObject();
        Student y = (Student)ois2.readObject();
        Student z = (Student)ois3.readObject();

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(Student.maxAge);

        ois1.close();
        ois2.close();
        ois3.close();
    }
}
