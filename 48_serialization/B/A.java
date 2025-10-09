import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class A {    
    public static void main(String[] args) {
        Shape shape = new Shape(23,72,120);

        File file = new File("yamraj.txt");

        try {
            FileOutputStream fos = new FileOutputStream(file);
            
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(shape);

            oos.close();
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}

