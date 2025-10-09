import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

class B {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("yamraj.txt");

            ObjectInputStream ois = new ObjectInputStream(fis);

            Shape shape = (Shape)ois.readObject();

            System.out.println(shape.length);
            System.out.println(shape.width);
            System.out.println(shape.height);

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
