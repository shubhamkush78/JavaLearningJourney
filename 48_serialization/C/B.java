import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

class B {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("yam.txt");

            ObjectInputStream ois = new ObjectInputStream(fis);
            
            Student x = (Student)ois.readObject();

            System.out.println(x.name);
            System.out.println(x.age);
            System.out.println(x.address.city);
            System.out.println(x.address.state);

            ois.close();
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        } catch(ClassNotFoundException e) {
            e.printStackTrace();
        }
    }    
}
