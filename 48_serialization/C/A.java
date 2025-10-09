import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

class A {
    public static void main(String[] args) {
        Student s = new Student("om", 9, new Address("Jbp", "MP"));

        try {
            FileOutputStream fos = new FileOutputStream("yam.txt");

            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(s);

            oos.close();
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }    
}
